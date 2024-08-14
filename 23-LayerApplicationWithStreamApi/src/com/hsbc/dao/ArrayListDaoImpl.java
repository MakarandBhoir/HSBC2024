package com.hsbc.dao;

import com.hsbc.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ArrayListDaoImpl implements StudentDao{
    private List<Student> list = new ArrayList<>();

    @Override
    public boolean createStudent(Student student) throws IllegalArgumentException {
        for(Student stud : list) {
            if (stud.getStudentId() == student.getStudentId()) {
                throw new IllegalArgumentException("Student is already present.");
            }
        }
        return list.add(student);
    }
    @Override
    public Student readStudentByStudentId(int studentId) {
//        Optional<Student> result = list.stream()
//                                    .filter(student -> student.getStudentId()==studentId)
//                                    .findFirst();
//        if(result.isPresent()){
//            return result.get();
//        }else{
//            throw new IllegalArgumentException("Student not found.");
//        }

        Student result = list.stream().filter(student -> student.getStudentId()==studentId)
                .findFirst()
                .orElseThrow( ()->  new IllegalArgumentException("Student not found."));
       return result;
    }
    @Override
    public Collection<Student> readAllStudents() {
        return list;
    }
}
