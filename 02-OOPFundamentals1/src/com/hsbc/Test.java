package com.hsbc;
public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Test1", 50000.0);
        Employee emp2 = new Employee(101, "Test2", 60000.5);

        //emp1.getEmployee(100, "Test1", 50000.0);
        //emp2.getEmployee(101, "Test2", 60000.5);

        emp1.displayEmployee();
        System.out.println("---------------------------------------");
        emp2.displayEmployee();
    }
}
