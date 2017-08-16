package com.wondersgroup.qdyth.compubif.utils;

import com.wondersgroup.qdyth.compubif.vo.UaasUserVO;



/**
 * 
 * @author xue
 * 2015-9-27
 */
public class BusinessContextUtils {
	private static BusinessUserContexThreadLocal userContext =new BusinessUserContexThreadLocal();
	public static UaasUserVO getUserContext(){
		return userContext.get();
	}
	
	public static void setUserContext(UaasUserVO uaasUserVO){
		userContext.set(uaasUserVO);
	}
}
