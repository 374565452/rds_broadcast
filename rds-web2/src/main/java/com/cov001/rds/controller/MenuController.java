package com.cov001.rds.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cov001.rds.cache.ICacheService;
import com.cov001.rds.common.dto.SysMenuDto;
import com.cov001.rds.common.util.Const;
import com.cov001.rds.common.util.JsonResult;
import com.cov001.rds.controller.base.BaseController;
import com.cov001.rds.controller.base.ErrorInfo;
import com.cov001.rds.service.ISysMenuService;

@Scope("prototype")
@Controller
@RequestMapping("/rds/menu")
public class MenuController extends BaseController{

	@Resource(name = "errorInfo")
	private ErrorInfo errorInfo;
	
	@Autowired
	private ICacheService cacheService;
	
	@Autowired
	private ISysMenuService sysMenuService;
	
	@RequestMapping("/list")
	@ResponseBody
	public JsonResult menuList(){
		Object obj= cacheService.getObj(ICacheService.CACHEMENU);
		List<SysMenuDto> menus;
		if(obj==null){
			synchronized (MenuController.class) {
				if(obj==null){
//System.out.println("get the data from db!!!!");
					menus=sysMenuService.getAllMenu();
					cacheService.setObj(ICacheService.CACHEMENU, menus, 10*60);
				}else{
					menus=(List<SysMenuDto>)obj;
				}
			}
		}else{
//System.out.println("get the data from cache!!!!!!");
			menus=(List<SysMenuDto>)obj;
		}
		returnMap.put("menuList", menus);
		returnMap.put("sessionAdminName", request.getSession().getAttribute(Const.SESSION_ADMIN));
		
		return new JsonResult(1, returnMap);
	}
	
	@RequestMapping("/auth")
	@ResponseBody
	public JsonResult loginAuth(){
		//System.out.println("aaaaaaaaaaaaaaaaaaa-----------");
		return new JsonResult(0, null, "00003", errorInfo.getErrorInfo("00003"));
	}
	
}
