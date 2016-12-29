package com.cov001.rds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rds")
public class PageController {

	@RequestMapping("/left")
	public String showLeft() {
		return "left.tpl";
	}

	@RequestMapping("/page")
	public String showSplitPage() {
		//System.out.println("访问page-----------");
		return "page.tpl";
	}

}
