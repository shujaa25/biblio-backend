package com.ishujaa.BiblioBack.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    @ConditionalOnProperty(name = "project.mode", havingValue = "dev")
//    public DB getDevDBBean(){}

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
