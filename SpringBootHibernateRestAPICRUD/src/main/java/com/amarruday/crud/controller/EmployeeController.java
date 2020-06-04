package com.amarruday.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarruday.crud.model.Employee;
import com.amarruday.crud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("employeeList")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployeesList();
	}
}
