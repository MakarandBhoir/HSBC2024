package com.hsbc;

import com.hsbc.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
// @Configuration
// @ComponentScan
// @EnabledAutoConfiguration
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);
        GreetingService service = context.getBean(GreetingService.class);
        System.out.println(service.greet());
        System.out.println("----------------------------------");
        for (String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
    }
    @Bean
    public ArrayList createList(){
        return new ArrayList();
    }
}