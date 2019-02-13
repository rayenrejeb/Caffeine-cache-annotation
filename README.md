# Caffeine-cache-annotation
Caffeine Cache Annotation - Spring cache  
This annotation is dedicated for spring applications  
Can be used on any class to activate the use of Caffeine Cache  
# Example    
@SpringBootApplication  
@EnableCaching  
@UseCaffeineCache  
public class SpringcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcacheApplication.class, args);
	}

}
