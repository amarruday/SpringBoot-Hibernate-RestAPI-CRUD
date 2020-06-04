package com.amarruday.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amarruday.crud.dao.EmployeeDAO;
import com.amarruday.crud.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	
	@Transactional
	@Override
	public List<Employee> getAllEmployeesList() {
		return dao.getAllEmployeesList();
	}

	@Transactional
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
