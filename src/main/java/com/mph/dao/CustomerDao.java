package com.mph.dao;

import java.util.List;


/**
 * @author Ashish
 * @version 1.0
 */

import com.mph.entity.Customer;

public interface CustomerDao {
	
	public void createCustomer(Customer customer);
	
	
	public List<Customer> getAllCustomers();
	
	
	public Customer getCustomer( Customer cust);
	
	public List<Customer>  updateCustomer(Customer Customer);
	
	public List<Customer>  deleteCustomer(int cno);
	
	
	
	public Customer getCustomerById(int cid);
}
