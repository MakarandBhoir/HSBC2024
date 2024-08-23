package com.hsbc.service;

import com.hsbc.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
	private List<Course> dummyDatabase = new ArrayList<>();
	
	public CourseServiceImpl() {
		dummyDatabase.add(new Course(1, "Java", 20000, 1001));
		dummyDatabase.add(new Course(2, "DevOps", 30000, 1002));
		dummyDatabase.add(new Course(3, "Python", 20000, 1003));
		dummyDatabase.add(new Course(4, "Angular", 15000, 1003));
	}
	@Override
	public List<Course> findCoursesByStudentId(int studentId) {
		return dummyDatabase.stream().filter(c -> c.getStudentId() == studentId).collect(Collectors.toList());
	}
}