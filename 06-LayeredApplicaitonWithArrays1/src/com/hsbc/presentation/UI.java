package com.hsbc.presentation;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import com.hsbc.service.StudentServiceImpl;

import java.util.Scanner;

public class UI {
    private static StudentService service = null;
    static {
        service = new StudentServiceImpl();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1. Add Student\n2. Find Student By Id\n3. Find All Students\n4. Exit");
            System.out.println("Enter your choice: ");
            int ch = scanner.nextInt();
            switch (ch){
                case 1:
                    Student student = new Student(1005, "Shaili", 71);
                    boolean result = service.addStudent(student);
                    if(result){
                        System.out.println("Student with id "+student.getStudentId()+" is added.");
                    }else{
                        System.out.println("Problem in adding student with id "+student.getStudentId());
                    }
                    break;
                case 2:
                    System.out.println("Enter student id: ");
                    int studentId = scanner.nextInt();
                    Student student1 = service.findStudentById(studentId);
                    System.out.println(student1);
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    break;
            }
            System.out.println("Thank you for using application!!!");
        }
    }
}
