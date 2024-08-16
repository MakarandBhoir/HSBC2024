package com.hsbc.dao;

import com.hsbc.model.Student;

import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao{
    private List<Student> studentDB = null;

    public void setStudentDB(List<Student> studentDB){
        this.studentDB = studentDB;
    }
    @Override
    public boolean createStudent(Student student) {
        return studentDB.add(student);
    }
    @Override
    public Student readStudentById(int studentId) {
        Student student = null;
        Optional<Student> optional = studentDB.stream().filter(e -> e.getStudentId() == studentId ).findFirst();
        if(optional.isPresent()){
            student = optional.get();
        }
        return student;
    }
    @Override
    public List<Student> readAllStudents() {
        return studentDB;
    }
}
