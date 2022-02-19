package com.mouritech.onlineflightticketbookingapplication.controller;

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
import com.mouritech.onlineflightticketbookingapplication.entity.Flight;

import com.mouritech.onlineflightticketbookingapplication.exception.FlightNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.FlightRepository;

import com.mouritech.onlineflightticketbookingapplication.service.FlightService;

@RestController// (@Controller + @ResponseBody)
@RequestMapping("flight/api/v1")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	FlightRepository flightRepository;
	
	@PostMapping("flights")
	public Flight insertFlight(@RequestBody Flight newFlight) {
		
		return flightService.insertFlight(newFlight);
		
	}
	@GetMapping("flights")
	public List<Flight> showAllFlights(){
		return flightService.showAllFlights();
		
	}
	@GetMapping("flights/{fid}")
	public Flight showFlightById(@PathVariable("fid") String flightId) throws FlightNotFoundException{
		return flightService.showFlightById(flightId);
				
		
	}
	@PutMapping("flights/{fid}")
	public Flight updateFlightById(@PathVariable("fid") String flightId,@RequestBody Flight flight) throws FlightNotFoundException{
		return flightService.updateFlightById(flightId, flight);
		
	}
	
	@DeleteMapping("flights/{fid}")
	public String deleteFlightById(@PathVariable("fid") String flightId) throws FlightNotFoundException{
		flightService.deleteFlightById(flightId);
		 return "deleted the flight";
		
	}
	@GetMapping("/flights/{locationid}")
	public ResponseEntity<List<Flight>> getAllFlightsByUserId(@PathVariable("locationId") Long locationId) throws LocationNotFoundException {
		return flightService. getAllFlightsByUserId(locationId);
	}
	
	@PostMapping("/flights/{locationid}/location")
	public ResponseEntity<Flight> createFlight(@PathVariable("locationid") Long locationId,
			@RequestBody Flight newFlight) throws LocationNotFoundException {
		return flightService.createFlight(locationId,newFlight);
		
	}


}
