package com.cov001.rds.controller.base;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ErrorInfo {
	private Map<String,String> errorInfo;

	public Map<String, String> getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(Map<String, String> errorInfo) {
		this.errorInfo = errorInfo;
	}

	public Map<String, String> getErrorMap(String code) {
		Map<String, String> returnMap = new HashMap<String, String>();
		if (errorInfo.get(code) != null) {
			returnMap.put("code", code);
			returnMap.put("msg", errorInfo.get(code));
		}
		return returnMap;
	}
	
	public String getErrorInfo(String code) {
		return errorInfo.get(code);
	}
}
