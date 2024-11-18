package com.example.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.User;
import com.example.app.repository.UserRepository;
import com.example.app.service.UserService;

@Service
public class UserServiceimpl  implements UserService {

	private UserRepository userRepository;

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		return	userRepository.findById(id).get();
	 
	}
	
	
	

}
