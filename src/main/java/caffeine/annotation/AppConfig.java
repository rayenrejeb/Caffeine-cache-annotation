package caffeine.annotation;

import java.lang.annotation.Annotation;
import java.util.Set;

import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Enable Caffeine Annotation This Class contains the annotation's logic
 *
 */

@Configuration
public class AppConfig {

	private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

	@Primary
	@Bean(name = "caffeine")
	public CacheManager getCacheManager(String... cacheNames) {
		return CacheConfig.createCacheManager();
	}

	public AppConfig() {

		Set<Class<? extends Object>> allClasses = new Reflections().getTypesAnnotatedWith(UseCaffeineCache.class);

		for (Class<? extends Object> clazz : allClasses) {
			if (clazz.isAnnotationPresent(UseCaffeineCache.class)) {

				System.out.println(clazz.getName());

				Annotation annotation = clazz.getAnnotation(UseCaffeineCache.class);
				UseCaffeineCache customAnnotation = (UseCaffeineCache) annotation;
			}
		}

	}
}
