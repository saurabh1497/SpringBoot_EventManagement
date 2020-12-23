package com.demo.model;

import javax.persistence.Column;

public class EventResponse {

	@Column(name = "event_id")
	private Integer eventId;
	@Column(name = "event_name")
	private String eventName;
	@Column(name = "skill_set")
	private Object skillSet;
	@Column(name = "action")
	private boolean action;
	@Column(name = "count_of_panel")
	private Integer countOfPanel;
	@Column(name = "entry_count")
	private Integer entryCount;
	@Column(name = "status")
	private String status;
	@Column(name = "date")
	private String date;
	@Column(name = "esc_time")
	private String escTime;
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Object getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(Object skillSet) {
		this.skillSet = skillSet;
	}
	public boolean isAction() {
		return action;
	}
	public void setAction(boolean action) {
		this.action = action;
	}
	public Integer getCountOfPanel() {
		return countOfPanel;
	}
	public void setCountOfPanel(Integer countOfPanel) {
		this.countOfPanel = countOfPanel;
	}
	public Integer getEntryCount() {
		return entryCount;
	}
	public void setEntryCount(Integer entryCount) {
		this.entryCount = entryCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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

	
	
}
