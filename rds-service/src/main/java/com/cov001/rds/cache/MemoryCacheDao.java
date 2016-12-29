package com.cov001.rds.cache;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

@Repository(value="memoryCaheDao")
public class MemoryCacheDao implements ICacheDao{

	private static ConcurrentHashMap<String,Long> cacheTime=new ConcurrentHashMap<String,Long>();// 缓存到期时间
	private static ConcurrentHashMap<String,Object> objectCache=new ConcurrentHashMap<String,Object>();// 缓存
	private static ConcurrentHashMap<String,HashMap<String,Object>> objectMapCache=new ConcurrentHashMap<String,HashMap<String,Object>>();// 缓存
	private static ConcurrentHashMap<String,String> stringCache=new ConcurrentHashMap<String,String>();// 缓存
	
	@Override
	public Object getObj(String key) {
		if( cacheTime.get(key) != null && cacheTime.get(key) < System.currentTimeMillis()){
			return null;
		}
//		String string = stringCache.get(key);
		
		return  objectCache.get(key);
	}

	@Override
	public boolean setStr(String key, String value, int expireTime) {
		stringCache.put(key, value);
		cacheTime.put(key, System.currentTimeMillis()+expireTime*1000);
		return true;
	}

	@Override
	public String getStr(String key) {
		if( cacheTime.get(key) != null && cacheTime.get(key) < System.currentTimeMillis()){
			return null;
		}
//		String string = stringCache.get(key);
		
		return  stringCache.get(key);
	}

	@Override
	public boolean setObj(String key, Object value, int expireTime) {
		objectCache.put(key, value);
		cacheTime.put(key, System.currentTimeMillis()+expireTime*1000);
		return true;
	}

	@Override
	public boolean delStr(String key) {
		stringCache.remove(key);
		cacheTime.remove(key);
		return true;
	}

	/***
	 * 删除一级缓存与二级缓存
	 */
	@Override
	public boolean delObj(String key) {
		objectCache.remove(key);
		objectMapCache.remove(key);
		cacheTime.remove(key);
		return true;
	}

	@Override
	public boolean delObj(String key, String field) {
		if(objectMapCache.containsKey(key)){
			objectMapCache.get(key).remove(field);
		}
		cacheTime.remove(key+"_"+field);
		return true;
	}

	@Override
	public boolean setObj(String key, String field, Object value, int expireTime) {
		HashMap<String, Object> hashMap;
		if(objectMapCache.containsKey(key)){
			hashMap=objectMapCache.get(key);
			hashMap.put(field, value);
		}else{
			hashMap=new HashMap<String, Object>();
			hashMap.put(field, value);
			objectMapCache.put(key, hashMap);
		}
		cacheTime.put(key+"_"+field, System.currentTimeMillis()+expireTime*1000);
		return true;
	}

	@Override
	public Object getObj(String key, String field) {
		if( cacheTime.get(key+"_"+field) != null && cacheTime.get(key+"_"+field) < System.currentTimeMillis()){
			return null;
		}
		if(objectMapCache.containsKey(key)){
			return objectMapCache.get(key).get(field);
		}
		return null;
	}

}
