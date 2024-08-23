package com.hsbc.service;

import com.hsbc.model.Course;

import java.util.List;

public interface CourseService {
	public List<Course> findCoursesByStudentId(int studentId);
}