package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.mouritech.onlineflightticketbookingapplication.entity.Flight;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;


public interface FlightService {
     
	Flight insertFlight(Flight newFlight);
    
    Flight showFlightById(String flightId) throws FlightNotFoundException;

	List<Flight> showAllFlights();

	Flight updateFlightById(String flightId, Flight flight) throws FlightNotFoundException;

	void deleteFlightById(String flightId) throws FlightNotFoundException;
    
	ResponseEntity<List<Flight>> getAllFlightsByUserId(Long locationId) throws LocationNotFoundException;
	
	ResponseEntity<Flight> createFlight(Long locationId, Flight newFlight) throws LocationNotFoundException;

	
	


}
