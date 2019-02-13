package caffeine.annotation.test;

import static org.junit.Assert.assertFalse;

import java.lang.annotation.Annotation;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import caffeine.annotation.UseCaffeineCache;

public class CheckAnnotatedClass {
	
	
	private static final Logger log = LoggerFactory.getLogger(CheckAnnotatedClass.class);


	@Test
	public void check1() {
		Set<Class<? extends Object>> allClasses = new Reflections("fr.codeonce.annotation.test").getTypesAnnotatedWith(UseCaffeineCache.class);
		
		assertFalse(allClasses.isEmpty());
		
		for (Class<? extends Object> clazz : allClasses) {
			if (clazz.isAnnotationPresent(UseCaffeineCache.class)) {

				log.debug("class: {} found with annotation", clazz.getName());

				Annotation annotation = clazz.getAnnotation(UseCaffeineCache.class);
				UseCaffeineCache customAnnotation = (UseCaffeineCache) annotation;
				Assert.assertNotNull(customAnnotation);
			}
		}
	}

}
