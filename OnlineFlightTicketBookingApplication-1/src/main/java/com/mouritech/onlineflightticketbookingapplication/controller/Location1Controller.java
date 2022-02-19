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
import com.mouritech.onlineflightticketbookingapplication.entity.Location1;
import com.mouritech.onlineflightticketbookingapplication.repository.Location1Repository;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;
import com.mouritech.onlineflightticketbookingapplication.service.Location1Service;
import com.mouritech.onlineflightticketbookingapplication.service.LocationService;
@RestController
@RequestMapping("location1/api/v1")
public class Location1Controller {
	
	
		@Autowired
		Location1Repository location1Repository;
		@Autowired
		private Location1Service location1Service;

		@GetMapping("/location1")
		public ResponseEntity<List<Location1>> getAllUsers(){
			return location1Service.getAllLocation();
		}
		@PostMapping("/location1")
		public Location1 insertUser(@RequestBody Location1 newLocation) {
			
			return location1Service.insertLocation(newLocation);
		}
}
