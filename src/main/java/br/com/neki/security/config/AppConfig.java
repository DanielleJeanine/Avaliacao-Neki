package br.com.neki.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:3000/","http://localhost:8000", "http://169.57.150.61:8014", "http://localhost:8014"
                		)
                .allowedMethods("*")
                .allowCredentials(true);
    }

}
