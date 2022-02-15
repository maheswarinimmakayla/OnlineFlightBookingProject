package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Passenger;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.PassengerNotFoundException;

public interface PassengerService  {
//   Passenger insertPassenger(Passenger newPassenger);
//    
//   Passenger showPassengerById(String passengerId) throws PassengerNotFoundException;
//
//	List<Passenger> showAllPassengers();
//
//	Passenger updatePassengerById(String passengerId, Passenger passenger) throws PassengerNotFoundException;
//
//	void deletePassengerById(String passengerId) throws PassengerNotFoundException;
	ResponseEntity<List<Passenger>> getAllPassenger();

	Passenger insertPassenger(Passenger newPassenger);
}
