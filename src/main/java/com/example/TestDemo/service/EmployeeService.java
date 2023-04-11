package com.example.TestDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDemo.model.Employee;
import com.example.TestDemo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee saveEmp(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
