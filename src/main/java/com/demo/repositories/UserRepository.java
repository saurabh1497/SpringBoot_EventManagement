package com.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.Event;
import com.demo.model.EventResponse;
import com.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);
	
	public User findByUserID(Long userID);
	
	public boolean existsByUserNameAndPassword(String username, String password);
	
	@Query(value = "SELECT B.Role FROM User A inner join Role B ON A.role_roleid = B.roleid where A.user_name = :username", nativeQuery = true)
	String findRole(String username);
	
	@Query(value = "Select event.event_name, event.entry_count" //event.event_name, event.entry_count 
			+ " FROM event inner Join participation "
			+ "on event.event_id = participation.eventID "
			+ "where participation.userID = :userID", nativeQuery = true)
	Event findEventById(Long userID);
	
	@Query(value = "Select * FROM Event e LEFT JOIN Post p on e.post_postid = p.postid "
			+ "where e.action = true "
			+ "AND e.count_of_panel > e.entry_count "
			+ "AND e.status = 'publish' "
			+ "AND p.postid = :postID" , nativeQuery = true)
	List<EventResponse> findEventByUserID(Long postID);
	
	@Query(value = "Select * from event" , nativeQuery = true)
	List<Event> getAllEventsTest();
}
