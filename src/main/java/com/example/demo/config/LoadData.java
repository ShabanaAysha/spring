package com.example.demo.config;

import com.example.demo.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class LoadData {

    private static final Logger log = LoggerFactory.getLogger(LoadData.class);
    public static List<Employee> employeeList = new ArrayList<>();
    private EmployeeRepository repository;

    public void initDatabase(EmployeeRepository repository) {
        this.repository = repository;
        loadDefaultList();
    }

    private void loadDefaultList() {
        repository.addEmployee(new Employee("Shabana", "Android"));
        repository.addEmployee(new Employee("Abilash", "iOS"));
    }

    public List<Employee> all() {
        return repository.findAll();
    }

    public void addEmployee(Employee employee){
        repository.addEmployee(employee);
    }}
