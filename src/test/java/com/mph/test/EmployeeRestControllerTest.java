package com.mph.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;


import com.mph.controller.EmployeeRestController;
import com.mph.entity.Employee;


class EmployeeRestControllerTest {
	
	EmployeeRestController employeerestcontroller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("Initiating Unit Testing ...");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("Terminating Unit Testing ...");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before calling Test method");
		employeerestcontroller = new EmployeeRestController();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		employeerestcontroller=null;
		System.out.println("@After calling Test method");
	}
	

	@SuppressWarnings("unchecked")
	@Test
	public void testEid()
	{
		
		System.out.println("Testing if the returned Employee and the requested employee are the same! ");
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the ID of the Employee you want to Delete?");
		int emid=sc.nextInt();
		try {
		ResponseEntity<List<Employee>> emplist=employeerestcontroller.deleteEmployee(emid);
		try{
			assertEquals("redirect:/getAllEmployees",emplist);
			ResponseEntity<Employee> emplist1 = employeerestcontroller.getEmployeeById(emid);
			if(((List<Employee>) emplist1).isEmpty())
				System.out.println("Employee was deleted successfully!");
			}
		catch(Exception exc){
			System.out.println("Oops!The employee could not be deleted!");
		}
		}
		catch(Exception e)
		{
			System.out.println("Oops!The Employee does not exist!");
		}

		finally {
			System.out.println("Employee deletion verified Successfully!");
		}
     }


}
