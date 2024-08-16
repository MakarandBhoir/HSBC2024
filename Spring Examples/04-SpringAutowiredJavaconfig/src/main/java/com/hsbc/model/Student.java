package com.hsbc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    private int studentId;
    private String studentName;
    private double studentScore;

    // byType
    // byName
    @Autowired
    @Qualifier("department")
    private Department dept;

    public Department getDept(){
        return dept;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, double studentScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }
}
