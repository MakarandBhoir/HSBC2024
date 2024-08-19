package com.hsbc.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String greet(){
        return "Welcome to Spring Boot !";
    }
}
