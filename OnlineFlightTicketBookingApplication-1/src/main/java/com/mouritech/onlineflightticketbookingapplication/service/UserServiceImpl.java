package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
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

	@Override
	public User getUserById(Long userId) throws UserNotFoundException {
		return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("user not found with id " + userId));
	}

	@Override
	public User updateUserById(Long userId, User user) throws UserNotFoundException {
		User existinguser = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("user not found with id " + userId));
		existinguser.setUserId(user.getUserId());
		existinguser.setUserName(user.getUserName());
		existinguser.setPassword(user.getPassword());
		existinguser.setAddress(user.getAddress());
		existinguser.setCity(user.getCity());
		existinguser.setCountry(user.getCountry());
		existinguser.setEmail(user.getEmail());
		existinguser.setMobileNo(user.getMobileNo());
		existinguser.setState(user.getState());
	
		userRepository.save(existinguser);
		return existinguser;
	}

	@Override
	public void deleteUserById(Long userId) throws UserNotFoundException {
		User existingUser = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("user not found with id " + userId));
		userRepository.delete(existingUser);
		
	}

}
