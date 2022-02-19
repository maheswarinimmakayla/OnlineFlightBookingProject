package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.mouritech.onlineflightticketbookingapplication.entity.Location1;

public interface Location1Service {
	ResponseEntity<List<Location1>> getAllLocation();

	Location1 insertLocation(Location1 newLocation);
}

