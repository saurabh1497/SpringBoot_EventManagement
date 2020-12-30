package com.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.LoginModel;
import com.demo.model.User;
import com.demo.repositories.RegistrationRepository;
import com.demo.services.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository repo;

	public User saveUser(User user) {
		return repo.save(user);
	}

	public User findUserByEmailId(User user) throws Exception {

		User existinguser = repo.findByEmailId(user.getEmailId());
		if (existinguser == null) {
			return repo.save(user);
		} else {
			throw new Exception("User with " + user.getEmailId() + " already exists");
		}
	}

	public User findUserByEmailIdAndPassword(LoginModel loginModel) throws Exception {
		if (loginModel.getPassword() == null) {
			throw new Exception("Please enter a password...!!!");

		}
		if (loginModel.getUserName() != null) {
			User u = repo.findByUserName(loginModel.getUserName());
			System.out.println(u);
			if (loginModel.getPassword().equals(u.getPassword())) {
				return u;
			} else {
				throw new Exception("Bad Credentials..!!!");
			}
		} else if (loginModel.getEmailId() != null) {
			User u = repo.findByUserName(loginModel.getUserName());
			if (loginModel.getPassword().equals(u.getPassword())) {
				return u;
			} else {
				throw new Exception("Bad Credentials..!!!");
			}
		} else {
			throw new Exception("Either Username or Email should be there!");
		}

	}
}
