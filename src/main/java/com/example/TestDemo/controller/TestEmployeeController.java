package com.example.TestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestDemo.model.Employee;
import com.example.TestDemo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class TestEmployeeController {
    @Autowired
	private EmployeeService employeeService;
    
    @PostMapping
    public Employee save(@RequestBody Employee employee) {
		return employeeService.saveEmp(employee);
    	
    }
    @GetMapping
    public List<Employee> findAll(){
		return employeeService.findAll();
    	
    }
	
}
