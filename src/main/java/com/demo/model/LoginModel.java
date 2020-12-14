package com.demo.model;

import javax.validation.constraints.NotEmpty;

public class LoginModel {

	private String emailId;
	private String userName;
	private String password;
	public LoginModel() {
		super();
	}
	public LoginModel(String emailId, String userName, String password) {
		super();
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
