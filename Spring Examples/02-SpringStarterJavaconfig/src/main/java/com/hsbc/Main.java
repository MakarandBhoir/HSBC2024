package com.hsbc;

import com.hsbc.service.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingService service = (GreetingService) context.getBean("greet");
        GreetingService service2 = (GreetingService) context.getBean("greet");

        System.out.println(service.hashCode());
        System.out.println(service2.hashCode());

        String result = service.greet();
        System.out.println(result);
    }
}