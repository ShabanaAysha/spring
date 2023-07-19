package com.example.demo.config;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    void addEmployee(Employee employee);

    List<Employee> findAll();


}
