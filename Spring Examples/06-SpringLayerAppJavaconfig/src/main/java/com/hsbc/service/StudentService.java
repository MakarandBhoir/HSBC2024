package com.hsbc.service;

import com.hsbc.model.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student);
    public Student findStudentById(int studentId);
    public List<Student> findAllStudents();
}
