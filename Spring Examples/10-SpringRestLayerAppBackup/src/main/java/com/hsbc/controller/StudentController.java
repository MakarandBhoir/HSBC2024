package com.hsbc.controller;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "students")
public class StudentController {
    @Autowired
    private StudentService service;

    // http://localhost:9091/students
    @GetMapping
    public List<Student> getAllStudents(){
        return service.findAllStudents();
    }
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody @Valid Student student){
        ResponseEntity<String> response = null;
        boolean result = service.addStudent(student);
        if(result){
            response = new ResponseEntity<>("Student added succssfully", HttpStatus.CREATED);
        }
        return response;
    }
}
