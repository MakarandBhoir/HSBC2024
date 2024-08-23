package com.hsbc.controller;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Course;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path = "students")
public class StudentRestController {
    @Autowired
    private StudentService service;
    @Autowired
    private RestTemplate restTemplate;

    // http://localhost:9091/students - Get
    @GetMapping(path = "")
    public List<Student> getAllStudents(){
        return service.findAllStudents();
    }
    // http://localhost:9091/students - Post
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        ResponseEntity<String> response = null;
        boolean result = service.addStudent(student);
        if (result){
            response = new ResponseEntity<>("Student is added", HttpStatus.CREATED);
        }else{
            response = new ResponseEntity<>("Student is not added", HttpStatus.BAD_REQUEST);
        }
        return response;
    }
    // http://localhost:9091/students/1001 - Get
    @GetMapping(path = "{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId)throws NoSuchStudentException {
        Student result = service.findStudentById(studentId);
        // call course microservice
        List<Course> courses = restTemplate.getForObject("http://localhost:9092/courses/student/"+studentId, List.class);
        result.setCourses(courses);
        return result;
    }
    @ExceptionHandler(NoSuchStudentException.class)
    @ResponseStatus(reason = "Student Not Found", code = HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleException(NoSuchStudentException e){
        // log the exception
    }
}





