package com.cov001.rds.controller.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.cov001.rds.common.dto.PageModel;

public class BaseController {
	
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	
	protected Map<String, Object> returnMap = new HashMap<String, Object>();
	
	
	
}
