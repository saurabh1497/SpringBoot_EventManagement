package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	@Query(value = "Select * FROM Event e LEFT JOIN Post p on e.post_postid = p.postid "
			+ "where e.action = true "
			+ "AND e.count_of_panel > e.entry_count "
			+ "AND e.status = 'publish' "
			+ "AND p.postid = :postID" , nativeQuery = true)
    List<Event> findevent(Long postID);
	
}
