package com.example.app.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.User;
import com.example.app.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> getAllUsers()
	{
	List<User> uslist	= userService.getAllUsers();
	
	return new ResponseEntity<List<User>>(uslist,HttpStatus.OK);
	}
	
	@GetMapping(value = "/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id)
	{
	    User us =	userService.getUser(id);
	    
	    return new ResponseEntity<User>(us,HttpStatus.OK);
		
	}

        @PostMapping(value ="/user")
	public ResponseEntity<User> add User()
        {
  
        }
}
