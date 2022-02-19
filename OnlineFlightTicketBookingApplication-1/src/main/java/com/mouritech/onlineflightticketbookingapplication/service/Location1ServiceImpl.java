package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.Location1;
import com.mouritech.onlineflightticketbookingapplication.repository.Location1Repository;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;

@Service
public class Location1ServiceImpl implements Location1Service{
	@Autowired
	Location1Repository location1Repository;

	@Override
	public ResponseEntity<List<Location1>> getAllLocation() {
		List<Location1> location = location1Repository.findAll();
		if(location.isEmpty()) {
			return new ResponseEntity<List<Location1>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Location1>>(location,HttpStatus.OK); 
		
	}

	@Override
	public Location1 insertLocation(Location1 newLocation) {
		return location1Repository.save(newLocation);
	}

}
