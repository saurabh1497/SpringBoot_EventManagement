package com.demo.services.impl;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.demo.model.Event;
import com.demo.model.User;
import com.demo.repositories.EventRepository;
import com.demo.repositories.RegistrationRepository;
import com.demo.services.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository repo;
	
	@Autowired
	private RegistrationRepository regRepo;
	

	public Event createEvent(Event event) throws Exception {
		// TODO Auto-generated method stub
		//get user details from regRepo, 
		//check for role (Manager)
		//if manager then save event else throw exception
		
//		User u = regRepo.findByUserName(userName);
//		if(u.getRole().equals("Manager")) {
//		return repo.save(event);
//		}else {
//			throw new Exception("Managers are allowed to create events..!!");
//		}
		
	
			//event.setAction(true);
			return repo.save(event);
		
		//return null;
		
	}
	
	public Event getEvent(Long id) {
		Optional<Event> optEvent = repo.findById(id);
		Event e = null;
		if(optEvent.isPresent()) {
			e = optEvent.get();
		}
		return e;	
	}
	
	public Event deleteEvent(Long id, Event event) {
		repo.deleteById(id);
		return event;
	}
	
	public List<Event> getAllEvents() {
		return repo.findAll();
	}

	
}
