package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
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

	@PostMapping("locations")
	public Location insertLocation(@RequestBody Location newLocation) {
		return locationService.insertLocation(newLocation);
		
	}
	@GetMapping("locations")
	public List<Location> getAllLocations(){
		return locationService.getAllLocations();
		
	}
	@GetMapping("locations/{lid}")
	public Location getLocationById(@PathVariable("lid") Long locationId) throws LocationNotFoundException{
		return locationService.getLocationById(locationId);
				
		
	}
	@PutMapping("locations/{lid}")
	public Location updateLocationById(@PathVariable("lid") Long locationId,@RequestBody  Location location) throws LocationNotFoundException{
		return locationService.updateLocationById(locationId, location);
		
	}
	
	@DeleteMapping("locations/{lid}")
	public String deleteLocationById(@PathVariable("lid") Long locationId) throws LocationNotFoundException{
		locationService.deleteLocationById(locationId);
		 return "deleted the location";
		
	}
	

}
