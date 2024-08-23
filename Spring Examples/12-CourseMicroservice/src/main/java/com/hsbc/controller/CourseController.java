package com.hsbc.controller;

import com.hsbc.model.Course;
import com.hsbc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "courses")
public class CourseController {
    @Autowired
    private CourseService service;

    // http://localhost:9092/courses/student/1001
    @GetMapping(path = "student/{studentId}")
    public List<Course> getStudentCourses(@PathVariable("studentId") int studentId){
        return service.findCoursesByStudentId(studentId);
    }
}
