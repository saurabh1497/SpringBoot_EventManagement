package com.demo.services;

import java.util.List;

import com.demo.model.Event;

public interface EventService {

	Event createEvent(Event event) throws Exception;
	public Event getEvent(Long id);
	public void deleteEvent(Long id);
	public List<Event> getAllEvents();
}
