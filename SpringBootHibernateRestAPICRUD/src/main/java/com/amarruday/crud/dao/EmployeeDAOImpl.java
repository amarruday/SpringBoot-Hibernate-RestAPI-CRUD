package com.amarruday.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.amarruday.crud.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> getAllEmployeesList() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee emp = session.get(Employee.class,id);
		return emp;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
	}

	@Override
	public void delete(int id) {
		//hod TODO Auto-generated met stub
		Session session = entityManager.unwrap(Session.class);
		Employee emp = session.get(Employee.class,id);
		session.delete(emp);
	}
	
}
