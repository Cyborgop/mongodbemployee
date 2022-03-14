package com.emp.mgmt.mongo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.mgmt.mongo.entity.Employee;
import com.emp.mgmt.mongo.service.EmployeeService;
@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.createEmployee(emp);
	}
	@GetMapping("/getById/{id}")
	public Employee getEmployeebyId(@PathVariable String id) {
		return employeeService.getEmployeebyId(id);
	}
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	@GetMapping("/getByDept/{dept}")
	public Employee getEmployeebyDept(@PathVariable String dept) {
		return employeeService.getEmployeebyDept(dept);
	}
	
}
