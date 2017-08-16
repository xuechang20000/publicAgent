package com.wondersgroup.qdyth.compubif.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLog;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentLogExample;
import com.wondersgroup.qdyth.compubif.pojo.PublicAgentValue;
import com.wondersgroup.qdyth.compubif.vo.ParamInVO;
import com.wondersgroup.qdyth.compubif.vo.ParamOutVO;
import com.wondersgroup.qdyth.compubif.vo.UaasUserVO;

public interface PublicAgentService {
	public List<PublicAgentLog> getPublicAgentLog(PublicAgentLogExample pale);
	public void insertPublicAgentLog(PublicAgentLog publicAgentLog);
	public UaasUserVO queryUser(UaasUserVO vo);
	public void insertPublicAgentValue(PublicAgentValue publicAgentValue);
	public ParamOutVO execProcess(ParamInVO vo,HttpServletRequest request);
}
