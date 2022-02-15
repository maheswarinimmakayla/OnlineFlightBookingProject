package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userRepository.findAll();
		if(users.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK); 
		
	}

	@Override
	public User insertUser(User newUser) {
		
		return userRepository.save(newUser);
	}

}
