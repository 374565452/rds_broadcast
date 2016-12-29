package com.cov001.rds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String showIndex(){
		//这里不能用redirect，因为这里会改变客户端浏览器的访问地址，导致不能正常显示界面
		//return "redirect:/rds/index";
		return "forward:/rds/index";
	}
	
	@RequestMapping("/rds/index")
	public String showIndexPage(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	
	
	
}
