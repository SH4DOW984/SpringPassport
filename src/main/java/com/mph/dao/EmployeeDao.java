package com.mph.dao;

import java.util.List;

/**
 * @author Ashish
 * @version 1.0
 */

import com.mph.entity.Employee;

public interface EmployeeDao {
	

	public void createEmployee(Employee employee);
	
	
	public List<Employee> getAllEmployees();
	
	
	public Employee getEmployee(Employee emp);
	
	public List<Employee>  updateEmployee(Employee employee);
	
	public List<Employee>  deleteEmployee(int eno);
	
	public Employee getEmployeeById(int eid);
}
