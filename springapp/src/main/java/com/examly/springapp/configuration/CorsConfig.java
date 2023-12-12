package com.examly.springapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200") // Allow all origins
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify the allowed methods
                        .allowedHeaders("*") // Allow all headers
                        .allowCredentials(false) // Allow sending cookies
                        .maxAge(3600); // Max age for the preflight request to be cached (in seconds)
            }
        };
    }
}
