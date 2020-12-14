package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.LoginModel;
import com.demo.model.User;
import com.demo.repositories.RegistrationRepository;
import com.demo.services.RegistrationService;

@RestController
@Validated
public class RegistrationController {

	@Autowired
	private RegistrationService service;

	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4201")
	public User registerUser(@RequestBody @Valid User user) throws Exception {
		return service.findUserByEmailId(user);

	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4201")
	public User loginUser(@RequestBody LoginModel loginModel) throws Exception {
		return service.findUserByEmailIdAndPassword(loginModel);
	}
}
