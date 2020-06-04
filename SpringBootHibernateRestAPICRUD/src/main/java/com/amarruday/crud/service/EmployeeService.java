package com.amarruday.crud.service;

import java.util.List;

import com.amarruday.crud.model.Employee;

public interface EmployeeService {
List<Employee> getAllEmployeesList();
	
	Employee getEmployeeById(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
