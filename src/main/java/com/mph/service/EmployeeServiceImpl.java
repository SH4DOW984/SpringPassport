package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.dao.EmployeeDaoImpl;
import com.mph.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	

	public void createEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
		
	}

	public List<Employee> getAllEmployees() {
	
		return employeeDao.getAllEmployees();
	}


	public Employee getEmployee(Employee emp) {
		
		return employeeDao.getEmployee(emp);
	}


	public List<Employee> updateEmployee(Employee employee) {
		
		return employeeDao.updateEmployee(employee);
	}


	public List<Employee> deleteEmployee(int eno) {
	
		return employeeDao.deleteEmployee(eno);
	}


	public Employee getEmployeeById(int eid) {
		
		return employeeDao.getEmployeeById(eid);
	}

}
