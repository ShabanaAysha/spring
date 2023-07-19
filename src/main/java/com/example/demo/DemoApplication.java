package com.example.demo;

import com.example.demo.config.EmployeeRepository;
import com.example.demo.config.LoadData;
import com.example.demo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication implements EmployeeRepository {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	LoadData loadData = new LoadData();

	@Override
	public void addEmployee(Employee employee) {
		List<Employee> list = LoadData.employeeList;
		list.add(employee);
	}

	@Override
	public List<Employee> findAll() {
		return LoadData.employeeList;
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		loadData.initDatabase(this);
		return String.format("Hello %s!", name);
	}

	@GetMapping("/hello/employees")
	public List<Employee> employees(@RequestParam(value = "name", defaultValue = "World") String name) {
		loadData.initDatabase(this);
		return loadData.all();
	}

	@PostMapping("/hello/employees/add")
	public void addEmployeeInList(@RequestBody Employee employee) {
		loadData.initDatabase(this);
		loadData.addEmployee(employee);
	}

}
