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
import com.mouritech.onlineflightticketbookingapplication.entity.Passenger;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.PassengerNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.BookingRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.PassengerRepository;
import com.mouritech.onlineflightticketbookingapplication.service.BookingService;
import com.mouritech.onlineflightticketbookingapplication.service.PassengerService;

@RestController// (@Controller + @ResponseBody)
@RequestMapping("passenger/api/v1")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	@Autowired
	PassengerRepository passengerRepository;
	
	@GetMapping("/passengers")
	public ResponseEntity<List<Passenger>> getAllPassenger(){
		return passengerService.getAllPassenger();
	}
	@PostMapping("/passengers")
	public Passenger insertPassenger(@RequestBody Passenger newPassenger) {
		
		return passengerService.insertPassenger(newPassenger);
		
	}
//	@PostMapping("passenger")
//	public Passenger insertPassenger(@RequestBody Passenger newPassenger) {
//		
//		return passengerService.insertPassenger(newPassenger);
//		
//	}
//	@GetMapping("passenger")
//	public List<Passenger> showAllPassengers(){
//		return passengerService.showAllPassengers();
//		
//	}
//	@GetMapping("passenger/{pid}")
//	public Passenger showPassengerById(@PathVariable("pid") String passengerId) throws PassengerNotFoundException{
//		return passengerService.showPassengerById(passengerId);
//				
//		
//	}
//	@PutMapping("passenger/{pid}")
//	public Passenger updatePassengerById(@PathVariable("pid") String passengerId,@RequestBody Passenger passenger) throws PassengerNotFoundException{
//		return passengerService.updatePassengerById(passengerId, passenger);
//		
//	}
//	
//	@DeleteMapping("passenger/{pid}")
//	public String deletePassengerById(@PathVariable("pid") String passengerId) throws PassengerNotFoundException{
//		passengerService.deletePassengerById(passengerId);
//		 return "deleted the passenger";
//		
//	}
}
