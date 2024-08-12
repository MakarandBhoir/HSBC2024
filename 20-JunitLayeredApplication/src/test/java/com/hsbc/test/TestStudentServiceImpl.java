package com.hsbc.test;

import org.junit.*;

public class TestStudentServiceImpl {
    @Before
    public void setUp(){
        System.out.println("Before Test");
    }
    @After
    public void tearDown(){
        System.out.println("After Test");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }
    @Test
    public void testAddStudentCreateNewStudentInArrayList(){
        System.out.println("testAddStudentCreateNewStudentInArrayList");
    }
    @Test
    public void testAddStudentCreateNewStudentInArrayList2(){
        System.out.println("testAddStudentCreateNewStudentInArrayList2");
    }
}
