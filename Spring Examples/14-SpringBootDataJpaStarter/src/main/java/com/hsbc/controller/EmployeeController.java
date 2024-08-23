package com.hsbc.controller;

import com.hsbc.model.Employee;
import com.hsbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    // http://localhost:9091/employees - post
    @PostMapping
    public void saveEmployee(@RequestBody @Valid Employee employee){
        service.addEmployee(employee);
    }
    // http://localhost:9091/employees - get
    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.findAllEmployees();
    }
    // http://localhost:9091/employees/101 - get
    @GetMapping(path = "{empId}")
    public Employee findEmployeeById(@PathVariable("empId") int employeeId){
        return service.findEmployeeById(employeeId);
    }
}
