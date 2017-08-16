package com.wondersgroup.qdyth.compubif.contrallor;


import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.wondersgroup.qdyth.compubif.exception.BusinessException;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLog;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentValue;
import com.wondersgroup.qdyth.compubif.service.PublicAgentService;
import com.wondersgroup.qdyth.compubif.utils.BusinessContextUtils;
import com.wondersgroup.qdyth.compubif.utils.StringTools;
import com.wondersgroup.qdyth.compubif.vo.ParamInVO;
import com.wondersgroup.qdyth.compubif.vo.ParamOutVO;
import com.wondersgroup.qdyth.compubif.vo.UaasUserVO;

@RestController
public class PublicAgentContrallor {

	private static Logger logger=Logger.getLogger(PublicAgentContrallor.class);
	@Autowired
	private PublicAgentService publicAgentService;
	
	@RequestMapping(value="/")
	@ResponseBody
	public String compubif(ParamInVO vo,HttpServletRequest request){
		logger.info("loginname:"+vo.getLoginname());
		logger.info("passwrod:"+vo.getPassword());
		logger.info("iftype:"+vo.getIftype());
		logger.info("paramjson:"+vo.getParamJson());
		ParamOutVO outvo=new ParamOutVO();
		try {
			/**
			 * 校验参数
			 */
			validateParams(vo);
			/**
			 * 解密
			 */
			decreParams(vo);
			/**
			 * 登陆验证
			 */
			validateUser(vo);
			
			/**
			 * 业务操作
			 */
			outvo=this.publicAgentService.execProcess(vo, request);
		} catch (Exception e) {
			if(e instanceof BusinessException){
				outvo.setRetCode("-1");
				BusinessException be=(BusinessException)e;
				outvo.setRetMsg(be.getErrorMsg());
			}else{
				outvo.setRetCode("-1");
				outvo.setRetMsg("未知错误！");
			}
			e.printStackTrace();
		}
		/**
		 * 保存日志
		 */	
		try {
			saveLog(vo,outvo,request);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return JSONObject.toJSONString(outvo,SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullStringAsEmpty);
	}
	
	/**
	 * 解密
	 * @param vo
	 */
	public void decreParams(ParamInVO vo){
		
	}
	/**
	 * 校验参数
	 * @param vo
	 */
	public void validateParams(ParamInVO vo){
		if(vo.getLoginname()==null||vo.getLoginname().trim().length()<2){
			throw new BusinessException(-1, "用户名信息长度有误！");
		}
		if(vo.getPassword()==null||vo.getPassword().trim().length()<2){
			throw new BusinessException(-1, "密码信息长度有误！");
		}
		if(vo.getIftype()==null||vo.getIftype().trim().length()<2){
			throw new BusinessException(-1, "接口类型信息长度有误！");
		}
		if(vo.getParamJson()==null||vo.getParamJson().trim().length()<2){
			throw new BusinessException(-1, "业务数据信息长度有误！");
		}
	}
	/**
	 * 登陆验证
	 */
	public UaasUserVO validateUser(ParamInVO vo){
		UaasUserVO in =new UaasUserVO();
		in.setLoginName(vo.getLoginname());
		in.setPassword(vo.getPassword());
		if("3101".equals(vo.getIftype())||"3102".equals(vo.getIftype())||"3103".equals(vo.getIftype())
				||"3105".equals(vo.getIftype())||"3107".equals(vo.getIftype())){
			in.setGroupid("-96");
		}else{
			in.setGroupid("0");
		}
		UaasUserVO out= this.publicAgentService.queryUser(in);
		if(out==null){
			throw new BusinessException(-1, "用户验证失败！");
		}else{
			BusinessContextUtils.setUserContext(out);
			return out;
		}
	}
	public PublicAgentLog saveLog(ParamInVO invo,ParamOutVO outvo,HttpServletRequest request) throws UnsupportedEncodingException{
		PublicAgentLog log=new PublicAgentLog();
		log.setLoginname(invo.getLoginname());
		log.setPassword(invo.getPassword());
		log.setParamjson(StringTools.subStringB(invo.getParamJson(), 1999));
		log.setIftype(invo.getIftype());
		log.setRetcode(outvo.getRetCode());
		log.setRetmsg(outvo.getRetMsg());
		log.setRetjson(StringTools.subStringB(outvo.getRetJson(), 1999));
		log.setIp(request.getRemoteAddr());
		log.setCalltime(new Date());
		this.publicAgentService.insertPublicAgentLog(log);
		return log;
	}
	
	public void setPublicAgentService(PublicAgentService publicAgentService) {
		this.publicAgentService = publicAgentService;
	}
	public PublicAgentService getPublicAgentService() {
		return publicAgentService;
	}
}
