package com.hsbc;

import com.hsbc.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Student student = context.getBean("student", Student.class);

        System.out.println(student.hashCode());
        System.out.println(student.getDept().hashCode());
    }
}