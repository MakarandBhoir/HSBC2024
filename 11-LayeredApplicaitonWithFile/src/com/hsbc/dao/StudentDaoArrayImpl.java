package com.hsbc.dao;

import com.hsbc.model.Student;

public class StudentDaoArrayImpl implements StudentDao{
    private static Student db[] = new Student[10];
    private static int index = -1;
    static {
        db[++index] = new Student(1001, "Anjali", 70);
        db[++index] = new Student(1002, "Nishta", 82);
        db[++index] = new Student(1003, "Shraddha", 83);
        db[++index] = new Student(1004, "Shaurya", 80);
    }
    @Override
    public boolean createStudent(Student student) {
        if(index < db.length-1){
            Student result = null;
            try {
                result = readStudentByStudentId(student.getStudentId());
            }
            catch (IllegalArgumentException e){

            }
            if(result != null){
                throw new IllegalArgumentException("Student ["+student.getStudentId()+"] is already present.");
            }
            db[++index] = student;
            return true;
        }else {
            return false;
        }
    }
    @Override
    public Student readStudentByStudentId(int studentId) {
        Student result = null;
        for (Student student : db){
            if(student != null && student.getStudentId() == studentId){
                result = student;
                break;
            }
        }
        if(result == null){
            throw new IllegalArgumentException(studentId+" not found.");
        }
        return result;
    }
    @Override
    public Student[] readAllStudents() {
        return db;
    }
}
