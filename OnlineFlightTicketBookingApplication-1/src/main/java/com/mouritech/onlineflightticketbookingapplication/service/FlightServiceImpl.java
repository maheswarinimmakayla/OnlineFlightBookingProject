package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Flight;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.FlightRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;

@Service
public class FlightServiceImpl  implements FlightService{
	
	@Autowired
	private FlightRepository  flightRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public Flight insertFlight(Flight newFlight) {
		newFlight.setFlightId(generateFlightId());
		return flightRepository.save(newFlight);
	}
	public String generateFlightId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	     
	      Long FId = (long) rand.nextInt(upperbound);
		return "F00" + FId; 
	
	}
	@Override
	public Flight showFlightById(String flightId) throws FlightNotFoundException {
		return flightRepository.findByFlightId(flightId).orElseThrow(() -> new FlightNotFoundException("flight not found with id " + flightId));
	}
	@Override
	public List<Flight> showAllFlights() {
		return flightRepository.findAll();
	}
	@Override
	public Flight updateFlightById(String flightId, Flight flight) throws FlightNotFoundException {
		Flight existingFlight = flightRepository.findByFlightId(flightId).orElseThrow(() -> new FlightNotFoundException("flight not found with id " + flightId));
		existingFlight.setDepartureLoc(flight.getDepartureLoc());
		existingFlight.setRemaingSeats(flight.getRemaingSeats());
		flightRepository.save(existingFlight);
		return existingFlight;
	}
	@Override
	public void deleteFlightById(String flightId) throws FlightNotFoundException {
		Flight existingFlight = flightRepository.findByFlightId(flightId).orElseThrow(() -> new FlightNotFoundException("flight not found with id " + flightId));
		flightRepository.delete(existingFlight);
		
	}
	@Override
	public ResponseEntity<List<Flight>> getAllFlightsByUserId(Long locationId) throws LocationNotFoundException {
		if(!locationRepository.existsById(locationId)) {
			throw new LocationNotFoundException("location not found with id " + locationId);
		}
		List<Flight> flight = flightRepository.findByLocation(locationId);
		return new ResponseEntity<List<Flight>>(flight,HttpStatus.OK);
	}
	@Override
	public ResponseEntity<Flight> createFlight(Long locationId, Flight newFlight) throws LocationNotFoundException {
		Flight flight = locationRepository.findById(locationId).map(
				location ->{
					newFlight.setLocation(location);
					newFlight.setFlightId(generateFlightId());
		
				
					return flightRepository.save(newFlight);
					
				}).orElseThrow(() -> new LocationNotFoundException("location not found with id " + locationId));
		return new ResponseEntity<Flight>(newFlight,HttpStatus.CREATED);
	}
	
	

}
