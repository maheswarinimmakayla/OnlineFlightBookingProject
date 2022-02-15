package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;
import com.mouritech.onlineflightticketbookingapplication.service.LocationService;
import com.mouritech.onlineflightticketbookingapplication.service.UserService;

@RestController
@RequestMapping("location/api/v1")
public class LocationController {
	@Autowired
	LocationRepository locationRepository;
	@Autowired
	private LocationService locationService;

	@GetMapping("/locations")
	public ResponseEntity<List<Location>> getAllUsers(){
		return locationService.getAllLocation();
	}
	@PostMapping("/locations")
	public Location insertUser(@RequestBody Location newLocation) {
		
		return locationService.insertLocation(newLocation);
		
	}
	

}
