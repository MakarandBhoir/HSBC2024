package com.hsbc.config;

import com.hsbc.model.Department;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hsbc.model")
public class AppConfig {
    @Bean(name = "department2")
    public Department createDepartmentBean(){
        return new Department();
    }
}
