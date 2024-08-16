package com.hsbc;

import com.hsbc.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Student student = context.getBean("student4", Student.class);
        System.out.println(student);
        System.out.println(student.getDept());
    }
}
