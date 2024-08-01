package com.hsbc.dao;

import com.hsbc.model.Student;

public interface StudentDao {
    // CRUD
    public boolean createStudent(Student student)throws IllegalArgumentException;
    public Student readStudentByStudentId(int studentId);
    public Student[] readAllStudents();
}
