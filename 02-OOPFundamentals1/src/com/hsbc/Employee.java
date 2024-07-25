package com.hsbc;

public class Employee {
    // instance varibales or data member
    int employeeId;
    String employeeName;
    double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary){
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // member function or method
    public void displayEmployee(){
        System.out.println("Employee Id = "+employeeId);
        System.out.println("Employee Name = "+employeeName);
        System.out.println("Employee Salary = "+employeeSalary);
    }
}
