package com.example.demo.controller;

import java.util.List;
import com.example.demo.repository.*;
import com.example.demo.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return repository.findAll();
	}
	
	@PostMapping("/users")
	public User addUser(@Validated
						@RequestBody User user	) {
		return repository.save(user);
	}
	
}
