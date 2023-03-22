package com.example.asmjava5springbott.config;

import com.example.asmjava5springbott.intercepror.UserAuthenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthenInterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private UserAuthenInterceptor userAuthenInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
             registry.addInterceptor(userAuthenInterceptor).addPathPatterns("/user/**");
    }
}
