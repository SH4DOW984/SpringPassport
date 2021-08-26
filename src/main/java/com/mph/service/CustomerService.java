package com.mph.service;

import java.util.List;

/**
 * @author Anshuman
 * @version 1.0
 */

import com.mph.entity.Customer;

public interface CustomerService {
	
	public void createCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	public Customer getCustomer( Customer cust);
	
	public List<Customer>  updateCustomer(Customer Customer);
	

	public List<Customer>  deleteCustomer(int cno);
	
	
	public Customer getCustomerById(int cid);

}
