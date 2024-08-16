package com.hsbc;

import com.hsbc.service.GreetingService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("app-context.xml");

        GreetingService service = (GreetingService) factory.getBean("greet");
        GreetingService service2 = (GreetingService) factory.getBean("greet");

        System.out.println(service.greet());
        System.out.println("--------------------------");
        System.out.println(service.hashCode());
        System.out.println(service2.hashCode());
    }
}