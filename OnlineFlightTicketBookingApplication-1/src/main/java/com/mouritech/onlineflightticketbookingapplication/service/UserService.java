package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.User;

public interface UserService {
	ResponseEntity<List<User>> getAllUsers();

	User insertUser(User newUser);
}
