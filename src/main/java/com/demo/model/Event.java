package com.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eventId;
	
	private String eventName;
	
	private int countOfPanel; //total people participating
	
	private String skillSet;
	
	private String date;
	
	private String escTime;
	
	private String status; //draft or publish
	
	private int entryCount;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Post post;
	
	private Boolean action; //close or open

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getCountOfPanel() {
		return countOfPanel;
	}

	public void setCountOfPanel(int countOfPanel) {
		this.countOfPanel = countOfPanel;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEscTime() {
		return escTime;
	}

	public void setEscTime(String escTime) {
		this.escTime = escTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEntryCount() {
		return entryCount;
	}

	public void setEntryCount(int entryCount) {
		this.entryCount = entryCount;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Boolean getAction() {
		return action;
	}

	public void setAction(Boolean action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", countOfPanel=" + countOfPanel
				+ ", skillSet=" + skillSet + ", date=" + date + ", escTime=" + escTime + ", status=" + status
				+ ", entryCount=" + entryCount + ", post=" + post + ", action=" + action + "]";
	}
	
	
}
