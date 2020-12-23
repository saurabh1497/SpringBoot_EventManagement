package com.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Event;
import com.demo.model.EventResponse;
import com.demo.model.User;
import com.demo.repositories.UserRepository;
import com.demo.services.EventService;

@RestController
public class EventManagerController {

	@Autowired
	private EventService service;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getallevents")	
	public List<Event> getAllEvents() {
		return service.getAllEvents();
	}

	@PostMapping("/createevent")
	public Event createEvent(@RequestBody Event event) throws Exception {
		return service.createEvent(event);
	}

	@GetMapping("/getevent/{id}")
	public Event getEvent(@PathVariable("id") Long id) {
		return service.getEvent(id);
	}

	@DeleteMapping("/deleteevent")
	public Event deleteEvent(@RequestBody Event event, Long id) {
		return service.deleteEvent(id, event);	
	}
	
	@GetMapping("/geteventbyuserid/{userID}" )
	public List<EventResponse> getEventByUserID(@PathVariable("userID") Long userID) {
		User user = userRepository.findByUserID(userID);
		List<EventResponse> eventList = userRepository.findEventByUserID(user.getPost().getPostID());
		return eventList;
	}
}
