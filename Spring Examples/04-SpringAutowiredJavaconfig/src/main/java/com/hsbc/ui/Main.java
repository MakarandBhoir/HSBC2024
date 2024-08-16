package com.hsbc.ui;

import com.hsbc.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        String names[] = context.getBeanDefinitionNames();
        for (String bean : names){
            System.out.println(bean);
        }
    }
}