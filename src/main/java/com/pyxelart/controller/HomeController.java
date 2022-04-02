package com.pyxelart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyxelart.UserRepo;
import com.pyxelart.model.User;

@RestController
public class HomeController {
	
	@Autowired
	UserRepo userRepo;
	
	
	@GetMapping("/home")
	public String getHome() {
		return "test result";
	}
	
	
	@GetMapping("/user")
	public User getUser() {
		return this.userRepo.findById(1L).get();
		
	}
	
	
	
}
