package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;


public interface LocationService {
	ResponseEntity<List<Location>> getAllLocation();

	Location insertLocation(Location newLocation);
	
	Location updateLocationById(String locationId, Location location) throws LocationNotFoundException;

	void deleteLocationById(String locationId) throws LocationNotFoundException;

}

