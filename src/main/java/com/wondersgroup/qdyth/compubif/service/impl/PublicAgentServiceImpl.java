package com.wondersgroup.qdyth.compubif.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.wondersgroup.qdyth.compubif.exception.BusinessException;
import com.wondersgroup.qdyth.compubif.mapper.ProcessMapper;
import com.wondersgroup.qdyth.compubif.mapper.PublicAgentLogMapper;
import com.wondersgroup.qdyth.compubif.mapper.PublicAgentValueMapper;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLog;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLogExample;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentValue;
import com.wondersgroup.qdyth.compubif.service.PublicAgentService;
import com.wondersgroup.qdyth.compubif.vo.ParamInVO;
import com.wondersgroup.qdyth.compubif.vo.ParamOutVO;
import com.wondersgroup.qdyth.compubif.vo.UaasUserVO;

@Service
public class PublicAgentServiceImpl implements PublicAgentService{
	
	@Autowired
    private PublicAgentLogMapper publicAgentLogMapper;
	@Autowired
    private PublicAgentValueMapper publicAgentValueMapper;
	@Autowired
    private ProcessMapper processMapper;
	/**
	 * 查询日志
	 */
	public List<PublicAgentLog> getPublicAgentLog(PublicAgentLogExample pale){
		 List<PublicAgentLog> logs= publicAgentLogMapper.selectByExample(pale);
		 return logs;
	}
	/**
	 * 插入日志
	 */
	public void insertPublicAgentLog(PublicAgentLog publicAgentLog){
		   publicAgentLogMapper.insert(publicAgentLog);
	}
	/**
	 * 查询人员
	 */
	public UaasUserVO queryUser(UaasUserVO vo){
		  return processMapper.queryUser(vo);
	}
	/**
	 * 插入参数
	 */
	public void insertPublicAgentValue(PublicAgentValue publicAgentValue){
		publicAgentValueMapper.insert(publicAgentValue);
	}
	/**
	 * 业务操作
	 */
	public ParamOutVO execProcess(ParamInVO vo,HttpServletRequest request){
		ParamOutVO outvo=new ParamOutVO();
		/**
		 *保存参数值
		 */
		PublicAgentValue pav=saveAndValidateParams(vo);
		/**
		 * 校验，执行内网业务过程
		 */
		Map<String,Object> mm=new HashMap<String,Object>();
		mm.put("pi_dataid", pav.getDataid());
		this.processMapper.callProcess(mm);
		if((Integer)mm.get("po_retcode")!=0){
			throw new BusinessException(-1, mm.get("po_retmsg").toString());
		}
		outvo.setRetCode("0");
		outvo.setRetMsg("成功！");
		return outvo;
	}
	/**
	 *保存参数值,并校验
	 */
	public PublicAgentValue saveAndValidateParams(ParamInVO vo){
		PublicAgentValue pav=null;
		try {
			 pav=JSONObject.parseObject(vo.getParamJson(), PublicAgentValue.class);
			 pav.setStatus(vo.getIftype());
			insertPublicAgentValue(pav);
		} catch (Exception e) {
			//e.printStackTrace();
			throw new BusinessException(-1, "保存业务参数数据失败!");
		}
		return pav;
	}
	
}
