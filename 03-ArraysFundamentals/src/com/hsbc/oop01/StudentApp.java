package com.hsbc.oop01;

public class StudentApp {
    public static void main(String[] args) {
        Student []students = new Student[5];
        students[0] = new Student(101, "Tushar", "9876543210");
        students[1] = new Student(102, "Rishita", "9876543211");
        students[2] = new Student(103, "Arya", "9876543212");
        students[3] = new Student(104, "Anjali", "9876543213");
        students[4] = new Student(105, "Tanmay", "9876543214");

        Course course1 = new Course("Java", 20000);
        Course course2 = new Course("Pyton", 21000);

        students[0].setCourse(course1);
        students[1].setCourse(course2);
        students[2].setCourse(course1);
        students[3].setCourse(course2);
        students[4].setCourse(course1);

        double todal = StudentTask.calculateTotalFees(students);

    }
}
