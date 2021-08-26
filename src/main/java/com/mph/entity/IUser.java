package com.mph.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "AUSER")
public class IUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int uid;
    @Column
	private String email;
    @Column
	private String password;
	
	
	public IUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IUser(int uid,String email, String password) {
		super();
		this.uid=uid;
		this.email = email;
		this.password = password;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "IUser [uid=" + uid + ", email=" + email + ", password=" + password + "]";
	}



	
}
	