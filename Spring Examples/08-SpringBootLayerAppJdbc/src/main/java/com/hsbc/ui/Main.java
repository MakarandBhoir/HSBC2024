package com.hsbc.ui;

import com.hsbc.config.AppConfig;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "com.hsbc")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);
        StudentService service = context.getBean(StudentService.class);

        Student student = context.getBean(Student.class);
        student.setStudentId(1001);
        student.setStudentName("Harsh");
        student.setStudentScore(80);
        student.getDept().setDeptId(10);
        student.getDept().setDeptName("IT");

        service.addStudent(student);

        Student result = service.findStudentById(student.getStudentId());
        System.out.println(result.getStudentId());
        System.out.println(result.getStudentName());
        System.out.println(result.getStudentScore());
        System.out.println(result.getDept().getDeptId());

    }
}
