package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Customer;
import com.mph.entity.Employee;
import com.mph.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

@RequestMapping(value = "/customer")

/**
 * @author Anuj
 * @version 1.0
 */
public class CustomerRestController {

   @Autowired
   CustomerService customerService;
   
  
   
   @GetMapping("/allcust")
   public ResponseEntity<List<Customer>>allCustomer(){
	   List<Customer> custlist = customerService.getAllCustomers();
	System.out.println("From Rest allcust : " + custlist);
	   

	if(custlist.isEmpty()) {
		
		return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<Customer>>(custlist,HttpStatus.OK);		
	
  }
   
   @PostMapping("/createCust")
   public Customer createEmployee(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		return customer;
	}
   
   
   @PutMapping("/updateCust")
	public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer customer) {
		
		List<Customer> custlist = customerService.updateCustomer(customer);
		System.out.println("From Rest update cust : " + custlist);
		
		if(custlist.isEmpty()) {
			
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Customer>>(custlist,HttpStatus.OK);		
		
	}
  
   @DeleteMapping("/deletecust/{id}")
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable("id") int cmid) {
		
		List<Customer> custlist = customerService.deleteCustomer(cmid);
		System.out.println("From Rest update cust : " + custlist);
		
		if(custlist.isEmpty()) {
			
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Customer>>(custlist,HttpStatus.OK);		
		
	}
  
   @GetMapping("/getCust/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int cmid) {
		
	   Customer cust = customerService.getCustomerById(cmid);
		System.out.println("From getCustby id: " + cust);
		
		if(cust==null) {
			
			return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);		
		
	}
   
   
}
