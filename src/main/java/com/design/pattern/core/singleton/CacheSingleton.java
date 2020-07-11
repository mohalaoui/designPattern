package com.design.pattern.core.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.util.Assert;

/**
 * 
 * @author almed
 *
 */
public class CacheSingleton {
	
	// instanciate before thread can access
	private ConcurrentMap<String, String> cache = new ConcurrentHashMap<>();
	
	private CacheSingleton() {}

	private static CacheSingleton instance = new CacheSingleton();
	
	public static CacheSingleton getInstance() {
		return instance;
	}

	private ConcurrentMap<String, String> getCache() {
		return cache;
	}
	 
	public void putValue(String key, String value) {
		Assert.hasText(key, "key must be set");
		Assert.hasText(value, "value must be set");
		getCache().put(key, value);
	}
	
	public String getValue(String key) {
		return getCache().get(key);
	}
	
	public void remove(String key) {
		getCache().remove(key);
	}
	
	public void clear() {
		 getCache().clear();
	}

}
