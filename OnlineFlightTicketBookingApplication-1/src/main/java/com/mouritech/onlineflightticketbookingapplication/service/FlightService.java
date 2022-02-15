package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Flight;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightNotFoundException;

public interface FlightService {
Flight insertFlight(Flight newFlight);
    
    Flight showFlightById(String flightId) throws FlightNotFoundException;

	List<Flight> showAllFlights();

	Flight updateFlightById(String flightId, Flight flight) throws FlightNotFoundException;

	void deleteFlightById(String flightId) throws FlightNotFoundException;

}
