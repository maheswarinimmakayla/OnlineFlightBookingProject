package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Passenger;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.PassengerNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.BookingRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.PassengerRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;
@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerRepository  passengerRepository;
	
	@Override
	public ResponseEntity<List<Passenger>> getAllPassenger() {
		List<Passenger> passenger = passengerRepository.findAll();
		if(passenger.isEmpty()) {
			return new ResponseEntity<List<Passenger>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Passenger>>(passenger,HttpStatus.OK); 
		
	}

	@Override
	public Passenger insertPassenger(Passenger newPassenger) {
		
		return passengerRepository.save(newPassenger);
	}


	
//	@Override
//	public Passenger insertPassenger(Passenger newPassenger) {
//		newPassenger.setPassengerId(generatePassengerId());
//		return passengerRepository.save(newPassenger);
//	}
//	public String generatePassengerId() {
//		Random rand = new Random(); //instance of random class
//	      int upperbound = 255;
//	        //generate random values from 0-254
//	      Long pId = (long) rand.nextInt(upperbound);
//		return "P00" + pId; 
//	
//	}
//	@Override
//	public Passenger showPassengerById(String passengerId) throws PassengerNotFoundException {
//		return passengerRepository.findByPassengerId(passengerId).orElseThrow(() -> new PassengerNotFoundException("passenger not found with id " + passengerId));
//		
	}
//	@Override
//	public List<Passenger> showAllPassengers() {
//		return passengerRepository.findAll();
//	}
//	@Override
//	public Passenger updatePassengerById(String passengerId, Passenger passenger) throws PassengerNotFoundException {
//		Passenger existingPassenger = passengerRepository.findByPassengerId(passengerId).orElseThrow(() -> new PassengerNotFoundException("passenger not found with id " + passengerId));
//		existingPassenger.setFirstName(passenger.getFirstName());
//		existingPassenger.setPassportNo(passenger.getPassportNo());
//		passengerRepository.save(existingPassenger);
//		return existingPassenger;
//	}
//	@Override
//	public void deletePassengerById(String passengerId) throws PassengerNotFoundException {
//		Passenger existingPassenger = passengerRepository.findByPassengerId(passengerId).orElseThrow(() -> new PassengerNotFoundException("passenger not found with id " + passengerId));
//		passengerRepository.delete(existingPassenger);
//		
//	}

