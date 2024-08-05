package com.hsbc.presentation;
import com.hsbc.dao.StudentDao;
import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.exceptions.InvalidStudentIdException;
import com.hsbc.factory.StudentDaoFactory;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import com.hsbc.service.StudentServiceImpl;

import java.util.Collection;
import java.util.Scanner;

public class UI {
    private static StudentServiceImpl service = null;
    static {
        service = new StudentServiceImpl();
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Where do you want to save your data. \n1. Array List\n2. Hash Set\n3. Tree Set.");
        int ch2 = scanner.nextInt();
        StudentDao dao = StudentDaoFactory.getInstance().createStudentDao(ch2);
        service.setDao(dao);
        while (flag){
            System.out.println("1. Add Student\n2. Find Student By Id\n3. Find All Students\n4. Exit");
            System.out.println("Enter your choice: ");
            int ch = scanner.nextInt();
            switch (ch){
                case 1:
                    Student student = new Student(1005, "Shaili", 71);
                    try {
                        boolean result = service.addStudent(student);
                        if (result) {
                            System.out.println("Student with id " + student.getStudentId() + " is added.");
                        }
                    }catch(DuplicateStudentException e){
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter student id: ");
                    int studentId = scanner.nextInt();
                    try {
                        Student student1 = service.findStudentById(studentId);
                        System.out.println(student1);
                    }catch (InvalidStudentIdException e){
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    Collection<Student> students = service.findAllStudents();
                    for (Student student1 : students){
                        System.out.println(student1);
                    }
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
        System.out.println("Thank you for using application!!!");
    }
}