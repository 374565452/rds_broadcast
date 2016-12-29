package com.cov001.rds.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;


public class CookieUtil {

	public static void deleteCookie(String key,HttpServletRequest req,HttpServletResponse resp){
		Cookie [] cookie=req.getCookies();
		if(cookie!=null &&cookie.length>0){
			for (Cookie c : cookie) {
				String keyname=c.getName();
				if(key.equals(keyname)){
					c.setValue(null);
					c.setMaxAge(0);
					resp.addCookie(c);
				}
			}
		}
	}
	
	public static void addCookie(String key,String value,HttpServletResponse response){
		addCookie(key,value,response,false,null);
	}
	
	public static void addCookie(String key,String value,HttpServletResponse response,
				boolean needEncode,String encrypKey){
		if(needEncode==true){
			value=Aes.encrypt(value,encrypKey);
		}else{
			value=new String(new Base64().encode(value.getBytes()));
		}
		Cookie cookie=new Cookie(key, value);
		cookie.setMaxAge(60*60*24*7);
		response.addCookie(cookie);
	}
	
	
	public static String getCookie(String key,HttpServletRequest req){
		return getCookie(key, req,false,null);
	}
	
	public static String getCookie(String key ,HttpServletRequest req,
			boolean needEncode,String encrypKey){
		Cookie allCookie[]= req.getCookies();
		if(allCookie!=null&&allCookie.length!=0)
		 {
		     for(int i=0;i<allCookie.length;i++)
		     {
		          String keyname= allCookie[i].getName();
		          if((key).equals(keyname))
		          {
					  if(allCookie[i].getValue()==null)
						  return "";
					  else if(needEncode)
						return Aes.desEncrypt(allCookie[i].getValue(),encrypKey);
					  else
						  return new String(new Base64().decode(allCookie[i].getValue()));
		          }
		         
		      }
		 }
		return "";
	}
	
}
