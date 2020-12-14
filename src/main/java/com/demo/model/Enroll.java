package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Enroll {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long enrollID;

	@OneToOne
	private User user;

	@OneToOne
	private Event event;

	private String date;

	private Boolean flag; //if user is enrolled or not

	public Long getEnrollID() {
		return enrollID;
	}

	public void setEnrollID(Long enrollID) {
		this.enrollID = enrollID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Enroll [enrollID=" + enrollID + ", user=" + user + ", event=" + event + ", date=" + date + ", flag="
				+ flag + "]";
	}

}
