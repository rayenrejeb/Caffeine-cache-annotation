# Caffeine-cache-annotation 
Caffeine Cache Annotation - Spring cache  
## @UseCaffeineCache
This annotation is dedicated for spring applications  
Can be used on any class to activate the use of Caffeine Cache  
# Example    
```
@SpringBootApplication  
@EnableCaching  
@UseCaffeineCache
public class SpringcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcacheApplication.class, args);
	}

}  
```
  
# Maven Dependency  
		<dependency>
			<groupId>caffeine</groupId>
			<artifactId>cache-annotation</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
