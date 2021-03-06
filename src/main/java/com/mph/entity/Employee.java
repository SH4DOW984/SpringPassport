package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
/**
 * This Entity is for the Employee class
 * @author Abhishek
 * @version 1.0
 */
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int eid;

	@Column
	@NotEmpty(message="name cannot be empty")
	private String fname;
	@Column
	@NotEmpty(message="name cannot be empty")
	private String lname;
	@Column
	private String gender;
	@Column
	@NotEmpty(message="email cannot be empty")
	private String email;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String fname, String lname, String gender, String email) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", email="
				+ email + "]";
	}

}
