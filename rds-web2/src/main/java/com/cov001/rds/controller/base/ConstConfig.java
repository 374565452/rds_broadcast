package com.cov001.rds.controller.base;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ConstConfig {

	private Map<String,String> constInfo;

	public Map<String, String> getConstInfo() {
		return constInfo;
	}

	public void setConstInfo(Map<String, String> errorInfo) {
		this.constInfo = errorInfo;
	}

	public Map<String, String> getConstMap(String code) {
		Map<String, String> returnMap = new HashMap<String, String>();
		if (constInfo.get(code) != null) {
			returnMap.put("code", code);
			returnMap.put("msg", constInfo.get(code));
		}
		return returnMap;
	}
	
	public String getConstValue(String code) {
		return constInfo.get(code);
	}
	
}
