package com.example.TestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TestDemo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
