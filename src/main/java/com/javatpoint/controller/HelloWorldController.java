package com.javatpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.User;
import com.javatpoint.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/user")
	public String getUser() {
		return "Hello world!";
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@PostMapping("/{id}")
	public String postTest(@PathVariable String id) {
		return id;
	}

}
