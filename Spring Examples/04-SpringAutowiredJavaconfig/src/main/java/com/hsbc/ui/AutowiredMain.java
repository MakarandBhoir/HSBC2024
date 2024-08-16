package com.hsbc.ui;

import com.hsbc.config.AppConfig;
import com.hsbc.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student.getDept());
    }
}
