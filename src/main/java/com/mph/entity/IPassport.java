package com.mph.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.mph.entity.Customer;

@Table(name="BIPASSPORT")
@Entity
/**
 * This Entity is for the IPassport class
 * @author Abhishek
 * @version 1.0
 */
public class IPassport {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PASS_ID")
	private int passNo;
	@Column
	@NotEmpty(message="country cannot be empty")
	private  String country;
	
	@Valid
	@OneToOne
	@JoinColumn(name = "CID",referencedColumnName = "C_ID")
	private Customer customer;
	
	@Column
	@NotEmpty(message="date cannot be empty")
	private Date issueDate;
	@Column
	@NotEmpty(message="date cannot be empty")
	private Date expireDate;

	public IPassport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IPassport(int passNo, String country, Customer customer, Date issueDate, Date expireDate) {
		super();
		this.passNo = passNo;
		this.country = country;
		this.customer = customer;
		this.issueDate = issueDate;
		this.expireDate = expireDate;
	}

	public int getPassNo() {
		return passNo;
	}

	public void setPassNo(int passNo) {
		this.passNo = passNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "IPassport [passNo=" + passNo + ", country=" + country + ", issueDate=" + issueDate + ", expireDate="
				+ expireDate + "]";
	}

	
		

}