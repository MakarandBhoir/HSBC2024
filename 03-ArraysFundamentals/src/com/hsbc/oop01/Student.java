package com.hsbc.oop01;

public class Student {
    private int studentId;
    private String studentName;
    private String contactNumber;

    private Course course; // has-a relationship

    public void setCourse(Course course){
        this.course = course;
    }

    public Student(int studentId, String studentName, String contactNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.contactNumber = contactNumber;
    }
    public void displayDetails(){
        System.out.println("Id = "+studentId);
        System.out.println("Name = "+studentName);
        System.out.println("Mobile = "+contactNumber);
        System.out.println("Course Name = "+course.getCourseName());
        System.out.println("Course Fees = "+course.getCourseFees());
    }
    public double getCourseFees(){
        return course.getCourseFees();
    }
}
