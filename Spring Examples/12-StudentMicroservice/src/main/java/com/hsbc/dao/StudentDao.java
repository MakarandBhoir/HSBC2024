package com.hsbc.dao;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

import java.util.List;

public interface StudentDao {
    public boolean createStudent(Student student);
    public Student readStudentById(int studentId)throws NoSuchStudentException;
    public List<Student> readAllStudents();
    public Student updateStudent(int studentId, Student student);
    public boolean deleteStudent(int studentId);
}
