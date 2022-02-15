package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;

@Service
public class LocationServiceImpl  implements LocationService {
	@Autowired
	LocationRepository locationRepository;

	@Override
	public ResponseEntity<List<Location>> getAllLocation() {
		List<Location> location = locationRepository.findAll();
		if(location.isEmpty()) {
			return new ResponseEntity<List<Location>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Location>>(location,HttpStatus.OK); 
		

	
	}

	@Override
	public Location insertLocation(Location newLocation) {
		return locationRepository.save(newLocation);
	}


}
