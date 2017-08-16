package com.wondersgroup.qdyth;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.wondersgroup.qdyth.compubif.utils.HttpClientUtil;
/**
 * Unit test for simple App.
 */
public class AppTest  {

	@Test
	public void testURLDecoder() throws IOException {
		String url="http://localhost:8080/publicAgent";
		HttpClientUtil httpClientUtil = new HttpClientUtil();  
        Map<String,String> createMap = new HashMap<String,String>();  
        createMap.put("loginname","3702010101");  
        createMap.put("password","96e79218965eb72c92a549dd5a330112");  
        createMap.put("iftype","3104");  
        createMap.put("paramJson","{\"name\":\"薛凤彪\"}");  
        String httpOrgCreateTestRtn = httpClientUtil.doPost(url,createMap,"UTF-8");  
        System.out.println(httpOrgCreateTestRtn);
	}
	
}
