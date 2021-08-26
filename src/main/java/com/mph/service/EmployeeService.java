package com.mph.service;

import java.util.List;

import com.mph.entity.Employee;
/**
 * @author Anshuman
 * @version 1.0
 */

public interface EmployeeService {
	
	public void createEmployee(Employee employee);


	public List<Employee> getAllEmployees();
	

	public Employee getEmployee(Employee emp);
	

	public List<Employee> updateEmployee(Employee employee);
	

	public List<Employee> deleteEmployee(int eno);
	

	public Employee getEmployeeById(int eid);

}
