package com.userRegistration.Project.Entity;

import jakarta.persistence.Entity;

@Entity
public class User {

	private int id;
	private String emailId;
	private int mobileNumber;
	private String userName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User(int id, String emailId, int mobileNumber, String userName) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
