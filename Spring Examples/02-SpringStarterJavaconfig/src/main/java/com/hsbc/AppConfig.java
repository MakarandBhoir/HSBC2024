package com.hsbc;

import com.hsbc.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "greet")
    @Scope(scopeName = "prototype")
    public GreetingService createGreetingService(){
        return new GreetingService();
    }
}
