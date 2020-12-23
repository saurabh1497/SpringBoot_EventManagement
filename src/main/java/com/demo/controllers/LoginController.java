package com.demo.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.repositories.UserRepository;



@RestController
public class LoginController {

	@Autowired
	private UserRepository userRepository;
	

	// check login provide correct user-name and password
	@PostMapping("/loginuser")
	public User showLoginPage(@RequestBody String[] authcust, User user) {
		
		//EventManagementApplication.valiadateEventDB();
		
		String username = authcust[0];
		String password = authcust[1];
		Boolean b1 = userRepository.existsByUserNameAndPassword(username, password);
		User u = null;
		if (b1) {
			String role = userRepository.findRole(username);
			u = userRepository.findByUserName(username);
			System.out.println(role);
			return u;
		} else {
			System.out.println("invalid");
			return u;
		}
	}

	// get details of employee provide user-name
	@GetMapping("login/{username}")
	public User showUserPage(@PathVariable String username, User user) {
			
		User u = userRepository.findByUserName(username);
		if(u!=null) {
			return u;
		} else {
			System.out.println("invalid");
			return u;
		}
	}

}
