package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {
	
	@Id
	private Long userID;
	
	@NotEmpty
	private String emailId;
	
	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String password;
	
	@OneToOne
	private Role role;
	
	@OneToOne
	private Post post;

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", emailId=" + emailId + ", userName=" + userName + ", password=" + password
				+ ", role=" + role + ", post=" + post + "]";
	}
	
	

	
	
}