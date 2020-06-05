package com.amarruday.crud.service;

import java.util.List;

import org.hibernate.Session;
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
		return dao.getEmployeeById(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		dao.save(employee);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
