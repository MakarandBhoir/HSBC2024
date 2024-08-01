package com.hsbc.service;

import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoArrayImpl;
import com.hsbc.model.Student;

public class StudentServiceImpl implements StudentService{
    // this will make service layer tiet-coupled coupled with dao layer
    //private StudentDao dao = new StudentDaoArrayImpl();
    private StudentDao dao = null;

    // help us to set-up dependency
    public void setDao(StudentDao dao){
        this.dao = dao;
    }

    @Override
    public boolean addStudent(Student student) {
        boolean result = dao.createStudent(student);
        return result;
    }
    @Override
    public Student findStudentById(int studentId) {
        Student result = dao.readStudentByStudentId(studentId);
        return result;
    }
    @Override
    public Student[] findAllStudents() {
        return dao.readAllStudents();
    }
}
