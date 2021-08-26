package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Employee;
import com.mph.service.EmployeeService;

@RestController
@RequestMapping(value = "/EMPLOYEE")
/**
 * @author Anuj
 * @version 1.0
 */
public class EmployeeRestController {
     
	@Autowired
	EmployeeService employeeService;
	 
	
	@GetMapping("/allemp")
	public ResponseEntity<List<Employee>> allEmployee() {
		
		List<Employee> emplist = employeeService.getAllEmployees();
		System.out.println("From Rest allemp : " + emplist);
		
		if(emplist.isEmpty()) {
			
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);		
		
	}
	
	@PostMapping("/createEmp")
	public Employee createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return employee;
	}
	 
	@PutMapping("/updateEmp")
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee) {
		
		List<Employee> emplist = employeeService.updateEmployee(employee);
		System.out.println("From Rest update emp : " + emplist);
		
		if(emplist.isEmpty()) {
			
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);		
		
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("id") int emid) {
		
		List<Employee> emplist = employeeService.deleteEmployee(emid);
		System.out.println("From Rest update emp : " + emplist);
		
		if(emplist.isEmpty()) {
			
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);		
		
	}
	
	
	@GetMapping("/getEmp/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int emid) {
		
		Employee emp = employeeService.getEmployeeById(emid);
		System.out.println("From getEmpby id: " + emp);
		
		if(emp==null) {
			
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);		
		
	}


}
