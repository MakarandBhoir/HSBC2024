package com.hsbc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String username){
        // call log method
        return "User = "+username+", saying hello!!!";
    }
    public void sayHello2(String username){
        System.out.println("User = "+username+", saying hello!!!");
    }

}
