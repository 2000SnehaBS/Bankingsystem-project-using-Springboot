
 package com.sixdee.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class BankSystem {
	@Id
	private int customerId;
	private String firstName;
	private String userName;
	private String lastName;
	private int age;
	private String address;
	private long mobileNumber;
	private String emailId;
	private String dateOfBirth;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", firstName=" + firstName + ", userName=" + userName
				+ ", lastName=" + lastName + ", age=" + age + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}

	

