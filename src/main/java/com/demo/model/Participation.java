package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long participationId;
	
	private Long eventId;
	
	private Integer userID;

}
