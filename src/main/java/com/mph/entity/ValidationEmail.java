package com.mph.entity;


/**
 * This Model is for the ValidationEmail class
 * @author Abhishek
 * @version 1.0
 */
public class ValidationEmail {
	private String email;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ValidationEmail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ValidationEmail(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}