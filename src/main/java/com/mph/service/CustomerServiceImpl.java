package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.CustomerDao;
import com.mph.dao.CustomerDaoImpl;
import com.mph.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
  
	@Autowired
	CustomerDao customerDao;
	
	

	public void createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
		
	}


	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
		
	}

	
	public Customer getCustomer(Customer cust) {
		return customerDao.getCustomer(cust);
		
	}
	
	
	public List<Customer> updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	
	public List<Customer> deleteCustomer(int cno) {
		return customerDao.deleteCustomer(cno);
	}

	@Override
	public Customer getCustomerById(int cid) {
		return customerDao.getCustomerById(cid);
		
	}


	
	}

