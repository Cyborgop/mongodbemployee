package com.tcs.emp.mgmt.employeemanagement.service;

import java.util.List;

import com.tcs.emp.mgmt.employeemanagement.entity.Employee;

public interface EmployeeService {
public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
