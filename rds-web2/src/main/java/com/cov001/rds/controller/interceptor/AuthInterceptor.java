package com.cov001.rds.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cov001.rds.common.util.Const;

public class AuthInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri=request.getRequestURI();
//System.out.println(uri);
		String str=request.getRequestURL().toString();
//System.out.println("========="+str);
		//System.out.println("dddddddddddddddddddddddddddddddddddd");
		Object user=request.getSession().getAttribute(Const.SESSION_ADMIN_USER);
//System.out.println(user);
		if(user == null){
			
			String link = str.substring(0,str.indexOf(uri));
//System.out.println("----------授权失败---- -"+link);
			response.sendRedirect("/login");
			return false;
		}
		else
		{
			return true;
			//String userName = adminName.toString();
			//if(userName.equals("") || !userName.equals("admin")){
				//response.sendRedirect("/login");
				//return false;
			//}
		}
		//return true;
		//return super.preHandle(request, response, handler);
	}
	
}
