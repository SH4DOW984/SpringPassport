package com.mph.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;








@Table(name="BCUSTOMER")
@Entity
/**
 * This Entity is for the Customer class
 * @author Abhishek
 * @version 1.0
 */
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "C_ID")
    private int cid;
    @Column
    @NotEmpty(message="First name cannot be empty")
	private String firstName;
    @Column
    @NotEmpty(message="last name cannot be empty")
	private String lastName;
    @Column
    @NotEmpty(message="name cannot be empty")
	private String fatherFirstName;
    @Column
    @NotEmpty(message="name cannot be empty")
	private String fatherLastName;
    @Column
    
	private String gender;
    @Column
    @Email(message="email shold be valid")
	private String email;
    @Column
    
	private long phoneNo;
    @Column
   
	private long aadharNo;
	//@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	@Column
	@NotEmpty(message="address cannot be empty")
    private String address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Customer(int cid, String firstName, String lastName, String fatherFirstName, String fatherLastName,
			String gender, String email, long phoneNo, long aadharNo, String address) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherFirstName = fatherFirstName;
		this.fatherLastName = fatherLastName;
		this.gender = gender;
		this.email = email;
		this.phoneNo = phoneNo;
		this.aadharNo = aadharNo;
		this.address = address;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherFirstName() {
		return fatherFirstName;
	}
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}
	public String getFatherLastName() {
		return fatherLastName;
	}
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherFirstName="
				+ fatherFirstName + ", fatherLastName=" + fatherLastName + ", gender=" + gender + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", aadharNo=" + aadharNo + ", address=" + address + "]";
	}
	
}
	
	
	