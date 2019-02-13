package fr.codeonce.annotation;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;

public class CacheConfig {
	
	
	private static final Logger log = LoggerFactory.getLogger(CacheConfig.class);


	public static CacheManager createCacheManager(String... cacheNames) {	
		CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
		caffeineCacheManager.setCacheNames(Arrays.asList("beans", "users"));
		return caffeineCacheManager;
	}

}
