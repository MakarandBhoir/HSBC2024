package com.hsbc.ui;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hsbc")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
