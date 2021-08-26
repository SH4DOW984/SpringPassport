package com.mph.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.Address;
import com.mph.entity.Customer;
import com.mph.entity.Employee;
import com.mph.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	Customer customer;
	
	@RequestMapping(value = "/registerpage",method = RequestMethod.GET)
	public ModelAndView register()
	{
		return new ModelAndView("register");		// actual page name
		
	}

	@RequestMapping(value = "/loginpage",method = RequestMethod.GET)
	public ModelAndView signin()
	{
		return new ModelAndView("login");
		
	}
	@RequestMapping(value = "/addcustomer",method = RequestMethod.POST)
	public ModelAndView signup(@RequestParam("txtfirstName") String firstName,
			@RequestParam("txtlastName") String lastName,
			@RequestParam("txtfatherFirstName") String fatherFirstName,
			@RequestParam("txtfatherLastName") String fatherLastName,
			@RequestParam("gender") String gender,
			@RequestParam("txtemail") String email,
			@RequestParam("txtphoneNo") long phoneNo,
			@RequestParam("txtaadharNo") long aadharNo,
			@RequestParam("txtaddress") String address)
	{
		System.out.println(firstName + "  " + lastName + " " + fatherFirstName + " " +  fatherLastName + " " + gender + "  " + email + " " + phoneNo + " " + aadharNo + " " + address);
		customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setFatherFirstName(fatherFirstName);
		customer.setFatherLastName(fatherLastName);
		customer.setGender(gender);
		customer.setEmail(email);
		customer.setPhoneNo(phoneNo);
		customer.setAadharNo(aadharNo);
		customer.setAddress(address);
		customerService.createCustomer(customer);
		
		return new ModelAndView("login");
		
	}
	@RequestMapping(value = "/home",method = RequestMethod.POST)
	public ModelAndView afterSignin(@RequestParam("txtemail") String email,@RequestParam("txtpassword") String password )
	{
		customer = new Customer();
		customer.setEmail(email);
		
		Customer cu = customerService.getCustomer(customer);
		if(cu==null) {
			
			ModelAndView mv = new ModelAndView("login");
			return mv.addObject("NOTIFICATION", "Customer NOT Found :( ");	
		}else {
		
		return allCustomer();
		}
	}
	public ModelAndView allCustomer()
	{
		List<Customer> custlist = customerService.getAllCustomers();
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("clist", custlist);	
		
	}
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public ModelAndView delete(Customer cust)
	{
		List<Customer> custlist = customerService.deleteCustomer(cust.getCid());
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("clist", custlist);	
		
		
	}
	@RequestMapping(value = "/edit",method = RequestMethod.GET)
	public ModelAndView edit(Customer customer)
	{
		return new ModelAndView("edit");
		
	}
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public ModelAndView update(@ModelAttribute Customer customer)
	{
		List<Customer> custlist = customerService.updateCustomer(customer);
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("clist",custlist);	
		
	}

			
			
			
}
