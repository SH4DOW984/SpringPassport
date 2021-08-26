package com.mph.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;


import com.mph.controller.CustomerRestController;
import com.mph.dao.CustomerDaoImpl;
import com.mph.entity.Customer;

public class RestControllerTest {
	
	CustomerRestController custController;
	
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
		custController = new CustomerRestController();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		custController=null;
		System.out.println("@After calling Test method");
	}
	
	@Test
	public void testCid()
	{
		System.out.println("Testing if the returned customer id and the requested customer id are the same! ");
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the ID of the customer you want to Delete?");
		int custId=sc.nextInt();
		try {
		ResponseEntity<List<Customer>> custDeleted=custController.deleteCustomer(custId);
		try{
			assertEquals("redirect:/getAllcustomers",custDeleted);
			ResponseEntity<Customer> cust = custController.getCustomerById(custId);
			if(((List<Customer>) cust).isEmpty())
				System.out.println("Customer was deleted successfully!");
			}
		catch(Exception exc){
			System.out.println("Oops!The customer could not be deleted!");
		}
		}
		catch(Exception e)
		{
			System.out.println("Oops!The customer does not exist!");
		}

		finally {
			System.out.println("Customer deletion verified Successfully!");
		}
     }

}
