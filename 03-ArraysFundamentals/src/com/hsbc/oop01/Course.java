package com.hsbc.oop01;

public class Course {
    private String courseName;
    private double courseFees;

    public Course(String courseName, double courseFees) {
        this.courseName = courseName;
        this.courseFees = courseFees;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getCourseFees() {
        return courseFees;
    }
}
