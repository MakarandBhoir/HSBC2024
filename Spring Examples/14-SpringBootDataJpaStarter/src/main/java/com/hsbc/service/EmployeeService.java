package com.hsbc.service;

import com.hsbc.model.Employee;
import com.hsbc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    public void addEmployee(Employee employee){
        repository.save(employee);
    }
    public Employee findEmployeeById(int employeeId){
        return repository.findById(employeeId).get();
    }
    public List<Employee> findAllEmployees(){
        return repository.findAll();
    }
}
