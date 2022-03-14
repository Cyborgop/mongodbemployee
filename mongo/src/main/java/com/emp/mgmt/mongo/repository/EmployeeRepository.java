package com.emp.mgmt.mongo.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emp.mgmt.mongo.entity.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	/*List<Employee> findByFirstName(String first_name);
	List<Employee> findByLastName(String last_name);*/
	List<Employee> findByDept(String dept);
}