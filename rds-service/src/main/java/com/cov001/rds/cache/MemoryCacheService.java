package com.cov001.rds.cache;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/***
 * 写这个类的目的是为了在启动时第一次访问时，加载一些固定的东西
 * 
 * @author Administrator
 *
 */
@Service
public class MemoryCacheService implements ICacheService {

	@Resource(name = "memoryCaheDao")
	private ICacheDao cacheDao;

	@Override
	public boolean delObj(String key) {
		return cacheDao.delObj(key);
	}

	@Override
	public boolean delObj(String key, String field) {
		return cacheDao.delObj(key, field);
	}

	@Override
	public Object getObj(String key) {
		return cacheDao.getObj(key);
	}

	@Override
	public Object setObj(String key, Object value, int expireTime) {
		return cacheDao.setObj(key, value, expireTime);
	}

}
