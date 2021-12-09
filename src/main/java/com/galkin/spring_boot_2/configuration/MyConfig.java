package com.galkin.spring_boot_2.configuration;

import com.galkin.spring_boot_2.interceptor.MyClassInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    private final String token = "api"; // Токен для сравнения

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyClassInterceptor(token)).addPathPatterns("/**");
    }
}
