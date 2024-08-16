package com.hsbc.model;

public class Student {
    private int studentId;
    private String studentName;
    private double studentScore;
    // has-a
    private Department dept;
    public void setDept(Department dept){
        this.dept = dept;
    }
    public Department getDept(){
        return dept;
    }
//    public Student() {
//    }
    public Student(int studentId, String studentName, double studentScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }
    public Student(int studentId, String studentName, double studentScore, Department dept) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentScore = studentScore;
        this.dept = dept;
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
