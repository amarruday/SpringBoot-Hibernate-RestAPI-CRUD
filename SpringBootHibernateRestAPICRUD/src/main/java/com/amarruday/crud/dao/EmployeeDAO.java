package com.amarruday.crud.dao;

import java.util.List;

import com.amarruday.crud.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> getAllEmployeesList();
	
	Employee getEmployeeById(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
