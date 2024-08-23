package com.hsbc.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements InitializingBean, DisposableBean
{
    public GreetingService(){
        System.out.println("Constructor is called.");
    }
    public String greet(){
        return "Hello from greeting service!";
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is called.");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy is called.");
    }
}
