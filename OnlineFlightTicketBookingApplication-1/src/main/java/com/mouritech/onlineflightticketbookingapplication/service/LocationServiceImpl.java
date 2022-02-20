package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;



@Service
public class LocationServiceImpl  implements LocationService {
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location insertLocation(Location newLocation) {
		
		return locationRepository.save(newLocation);
	}
	



	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}



	@Override
	public void deleteLocationById(Long locationId) throws LocationNotFoundException {
		Location existingBooking = locationRepository.findById(locationId).orElseThrow(() -> new LocationNotFoundException("booking not found with id " + locationId));
		locationRepository.delete(existingBooking);
	}


	@Override
	public Location getLocationById(Long locationId) throws LocationNotFoundException {
		return locationRepository.findById(locationId).orElseThrow(() -> new LocationNotFoundException("location not found with id " + locationId));
	}


	@Override
	public Location updateLocationById(Long locationId, Location location) throws LocationNotFoundException {
		Location existingLocation = locationRepository.findById(locationId).orElseThrow(() -> new LocationNotFoundException("location not found with id " + locationId));
		existingLocation.setLocationId(location.getLocationId());
		existingLocation.setLocationFrom(location.getLocationFrom());
		existingLocation.setLocationTo(location.getLocationTo());
		existingLocation.setOnWordDate(location.getOnWordDate());
	
		locationRepository.save(existingLocation);
		return existingLocation;
	}





	

}