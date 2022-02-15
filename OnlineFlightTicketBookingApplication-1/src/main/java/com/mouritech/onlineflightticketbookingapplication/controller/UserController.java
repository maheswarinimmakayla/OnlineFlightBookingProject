package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;
import com.mouritech.onlineflightticketbookingapplication.service.UserService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("user/api/v1")
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(){
		return userService.getAllUsers();
	}
	@PostMapping("/users")
	public User insertUser(@RequestBody User newUser) {
		
		return userService.insertUser(newUser);
		
	}
	
}