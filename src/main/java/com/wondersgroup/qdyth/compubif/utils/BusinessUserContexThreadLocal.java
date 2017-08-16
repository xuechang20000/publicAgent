package com.wondersgroup.qdyth.compubif.utils;

import com.wondersgroup.qdyth.compubif.vo.UaasUserVO;



public class BusinessUserContexThreadLocal extends ThreadLocal<UaasUserVO>{

	@Override
	protected UaasUserVO initialValue() {
		// TODO Auto-generated method stub
		return super.initialValue();
	}
}
