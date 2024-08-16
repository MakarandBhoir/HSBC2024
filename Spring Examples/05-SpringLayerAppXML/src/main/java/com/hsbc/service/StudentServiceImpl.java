package com.hsbc.service;

import com.hsbc.dao.StudentDao;
import com.hsbc.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentDao dao = null;

    public void setDao(StudentDao dao){
        this.dao = dao;
    }
    @Override
    public boolean addStudent(Student student) {
        return dao.createStudent(student);
    }
    @Override
    public Student findStudentById(int studentId) {
        return dao.readStudentById(studentId);
    }
    @Override
    public List<Student> findAllStudents() {
        return dao.readAllStudents();
    }
}
