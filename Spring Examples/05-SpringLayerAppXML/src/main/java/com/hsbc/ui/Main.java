package com.hsbc.ui;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

        Student student = context.getBean(Student.class);
        student.setStudentId(1009);
        student.setStudentName("Harsh");
        student.setStudentScore(80);
        student.getDept().setDeptId(10);
        student.getDept().setDeptName("IT");

        StudentService service = (StudentService) context.getBean("service");
        boolean result = service.addStudent(student);
        if(result){
            System.out.println("Student is added.");
        }
        List<Student> list = service.findAllStudents();
        list.forEach(e -> System.out.println(e.getStudentName()));


    }
}
