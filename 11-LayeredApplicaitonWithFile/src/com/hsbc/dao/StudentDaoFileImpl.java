package com.hsbc.dao;

import com.hsbc.model.Student;

public class StudentDaoFileImpl implements StudentDao{

    private static Student db[] = new Student[10];
    private static int index = -1;

    public void setDb(Student db[]){
        StudentDaoFileImpl.db = db;
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
