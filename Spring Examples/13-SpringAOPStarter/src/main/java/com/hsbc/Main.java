package com.hsbc;

import com.hsbc.service.GreetingService;
import com.hsbc.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);
        GreetingService bean = context.getBean(GreetingService.class);
        HelloService bean2 = context.getBean(HelloService.class);
        bean2.sayHello2("Makarand");


//        String message = bean.greet();
//        System.out.println("Message = "+message);

    }
}