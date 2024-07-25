package com.hsbc.oop01;

public class StudentTask {

    public static double calculateTotalFees(Student []students){
        double total = 0.0;
        for(Student student : students){
            total = total + student.getCourseFees();
        }
        return total;
    }
}
