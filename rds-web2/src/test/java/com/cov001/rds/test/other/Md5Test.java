package com.cov001.rds.test.other;

import org.junit.Test;

import com.cov001.rds.common.util.MD5;

public class Md5Test {

	@Test
	public void testMd5(){
		//本系统中超级管理员终极密码为super
		String str=MD5.encrytMD5("super");
		System.out.println(str);
		
		String adminStr =MD5.encrytMD5("admin");
		System.out.println(adminStr);
	}
	
}
