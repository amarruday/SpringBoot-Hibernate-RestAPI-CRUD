package com.amarruday.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarruday.crud.model.Employee;
import com.amarruday.crud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employeeList")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployeesList();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee emp = service.getEmployeeById(id);
		if (emp == null) {
			throw new RuntimeException("Employee with id " + id + " is not found.");
		}
		return emp;
	}
	
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employee)
	{
		service.save(employee);
		return employee;
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.delete(id);
		return "Employee Record has been deleted.";
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		service.save(employee);
		return employee;
	}
}


