package com.wondersgroup.qdyth.compubif.mapper;

import java.util.Map;

import com.wondersgroup.qdyth.compubif.vo.UaasUserVO;

public interface ProcessMapper {

	UaasUserVO queryUser(UaasUserVO vo);
	void callProcess(Map map);
}
