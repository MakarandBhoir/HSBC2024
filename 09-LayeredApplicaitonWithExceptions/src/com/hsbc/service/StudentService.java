package com.hsbc.service;

import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.model.Student;

public interface StudentService {
    public boolean addStudent(Student student)throws DuplicateStudentException;
    public Student findStudentById(int studentId);
    public Student[] findAllStudents();
}
