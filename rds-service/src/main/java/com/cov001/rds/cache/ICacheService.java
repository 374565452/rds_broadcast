package com.cov001.rds.cache;

public interface ICacheService {
	
	public static String CACHEMENU = "cache:menu";
	
	boolean delObj(String key);

	boolean delObj(String key, String field);

	Object getObj(String key);

	Object setObj(String key, Object value, int expireTime);

}
