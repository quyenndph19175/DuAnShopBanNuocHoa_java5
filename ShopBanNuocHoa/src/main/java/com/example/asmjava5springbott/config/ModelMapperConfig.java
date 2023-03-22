package com.example.asmjava5springbott.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper initModelMapper() {
        return new ModelMapper();
    }
}
