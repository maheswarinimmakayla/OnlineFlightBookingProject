package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;

public interface UserService {
	ResponseEntity<List<User>> getAllUsers();

	User insertUser(User newUser);
	
	User getUserById(Long userId) throws UserNotFoundException;

    User updateUserById(Long userId, User user) throws UserNotFoundException;

	void deleteUserById(Long userId) throws UserNotFoundException;
}
