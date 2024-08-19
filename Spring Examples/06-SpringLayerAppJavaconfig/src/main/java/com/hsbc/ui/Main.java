package com.hsbc.ui;

import com.hsbc.config.AppConfig;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = context.getBean(StudentService.class);

        Student student = context.getBean(Student.class);
        student.setStudentId(1009);
        student.setStudentName("Harsh");
        student.setStudentScore(80);
        student.getDept().setDeptId(10);
        student.getDept().setDeptName("IT");

        Student student2 = context.getBean(Student.class);
        student2.setStudentId(1010);
        student2.setStudentName("Rishabh");
        student2.setStudentScore(84);
        student2.getDept().setDeptId(20);
        student2.getDept().setDeptName("CM");

        service.addStudent(student);
        service.addStudent(student2);

        service.findAllStudents().stream().filter(e->e.getStudentName() != null)
                .forEach(e -> System.out.println(e.getStudentName()));
    }
}
