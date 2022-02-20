package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;


public interface LocationService {

	Location insertLocation( Location newLocation);
    
	Location getLocationById(Long locationId) throws LocationNotFoundException;

	List<Location> getAllLocations();

	Location updateLocationById(Long locationId, Location location) throws LocationNotFoundException;

	void deleteLocationById(Long locationId) throws LocationNotFoundException;

}

