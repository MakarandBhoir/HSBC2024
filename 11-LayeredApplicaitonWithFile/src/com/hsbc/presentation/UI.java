package com.hsbc.presentation;
import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoFileImpl;
import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.exceptions.InvalidStudentIdException;
import com.hsbc.factory.StudentDaoFactory;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import com.hsbc.service.StudentServiceImpl;

import java.io.*;
import java.util.Scanner;

public class UI {
    private static StudentServiceImpl service = null;
    static {
        service = new StudentServiceImpl();
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Where do you want to save your data. \n1. Array\n2. Collection\n3. File");
        int ch2 = scanner.nextInt();
        StudentDao dao = StudentDaoFactory.getInstance().createStudentDao(ch2);
        service.setDao(dao);

        if(dao instanceof StudentDaoFileImpl fileImpl){
            try(FileInputStream fis = new FileInputStream("D:\\Training\\HSBC\\Batch3\\Core Java\\test\\studentdb.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);)
            {
                Student db[] = (Student[]) ois.readObject();
                if(db != null) {
                    fileImpl.setDb(db);
                }
            }catch (FileNotFoundException e){
                System.out.println("File not found.");
            }
            catch (IOException | ClassNotFoundException e){

                System.out.println("Problem reading file");
            }
        }

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
                    break;
                case 4:
                    flag = false;
                    if(dao instanceof StudentDaoFileImpl)
                    {
                        Student studentdb[] = service.findAllStudents();
                        try (FileOutputStream fos = new FileOutputStream("D:\\Training\\HSBC\\Batch3\\Core Java\\test\\studentdb.ser");
                             ObjectOutputStream oos = new ObjectOutputStream(fos);)
                        {
                            oos.writeObject(studentdb);
                            oos.flush();
                        }catch (FileNotFoundException e){
                            System.out.println("File not found.");
                        }
                        catch (IOException e){
                            System.out.println("Problem writing object.");
                        }
                    }
                    break;
            }
        }
        System.out.println("Thank you for using application!!!");
    }
}