package com.hsbc.test;

import com.hsbc.dao.StudentDao;
import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.factory.StudentDaoFactory;
import com.hsbc.model.Student;
import com.hsbc.service.StudentServiceImpl;
import org.junit.*;
import static org.junit.Assert.*;

public class TestStudentServiceImpl2 {
    StudentServiceImpl service = null;
    @Before
    public void setUp(){
        service = new StudentServiceImpl();
        StudentDao dao = StudentDaoFactory.getInstance().createStudentDao(1);
        service.setDao(dao);
    }
    @After
    public void tearDown(){
        service = null;
    }
    @Test
    public void testAddStudentCreateNewStudentInArrayList()throws DuplicateStudentException {
        Student student = new Student(1005, "Shaili", 76);
        boolean result = service.addStudent(student);
        assertTrue(result);
    }
    @Test(expected = DuplicateStudentException.class)
    public void testAddStudentCreateNewStudentInArrayList2() throws DuplicateStudentException{
        Student student = new Student(1005, "Shaili", 76);
        boolean result = service.addStudent(student);
        service.addStudent(student);
    }
}
