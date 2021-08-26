package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Address {
	
	@Id
	
	private int addrId;

	private int doorno;
	private String street;
	private String city;
	private int pincode;
	
	//@ManyToOne
	//@JoinColumn(name = "cid",referencedColumnName = "C_ID")
	private Customer customer;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addrId, int doorno, String street, String city, int pincode, Customer customer) {
		super();
		this.addrId = addrId;
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.customer = customer;
	}

	
   

}