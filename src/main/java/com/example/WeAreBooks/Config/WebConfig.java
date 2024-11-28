package com.example.WeAreBooks.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class WebConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")  // Allow all paths
                    .allowedOrigins("http://localhost:3000")  // Replace with your allowed origins
                    .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                    .allowedHeaders("*")  // Allow all headers
                    .allowCredentials(true);  // Allow sending cookies
        }
    }


