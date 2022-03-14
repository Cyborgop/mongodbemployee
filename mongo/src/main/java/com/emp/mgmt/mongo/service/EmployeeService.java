package com.emp.mgmt.mongo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.mgmt.mongo.entity.Employee;
import com.emp.mgmt.mongo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee createEmployee (Employee emp) {
		return employeeRepository.save(emp);
	}

	public Employee getEmployeebyId(String id) {
		
		return employeeRepository.findById(id).get();
	}

	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	public Employee getEmployeebyDept(String dept) {
		
		return employeeRepository.findByDept(dept).get(0);
	}
	

}
