package com.demo.services;

import com.demo.model.LoginModel;
import com.demo.model.User;



public interface RegistrationService {
	
	public User findUserByEmailId(User user) throws Exception;
	public User findUserByEmailIdAndPassword(LoginModel loginModel) throws Exception;
}
