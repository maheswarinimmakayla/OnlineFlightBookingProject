package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mouritech.onlineflightticketbookingapplication.entity.Booking;

import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.FightBookedAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.BookingRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;
import com.mouritech.onlineflightticketbookingapplication.service.BookingService;

@RestController// (@Controller + @ResponseBody)
@RequestMapping("booking/api/v1")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	@Autowired
	BookingRepository bookingRepository;
	
	@PostMapping("bookings")
	public Booking insertBooking(@RequestBody Booking newBooking) {
		
		return bookingService.insertBooking(newBooking);
		
	}
	@GetMapping("booking")
	public List<Booking> showAllBookings(){
		return bookingService.showAllBookings();
		
	}
	@GetMapping("booking/{bid}")
	public Booking showBookingById(@PathVariable("bid") String bookingId) throws BookingNotFoundException{
		return bookingService.showBookingById(bookingId);
				
		
	}
	@PutMapping("booking/{bid}")
	public Booking updateBookingById(@PathVariable("bid") String bookingId,@RequestBody Booking booking) throws BookingNotFoundException{
		return bookingService.updateBookingById(bookingId, booking);
		
	}
	
	@DeleteMapping("booking/{bid}")
	public String deleteProductById(@PathVariable("bid") String bookingId) throws BookingNotFoundException{
		bookingService.deleteBookingById(bookingId);
		 return "deleted the booking";
		
	}
	@GetMapping("/booking/{userid}")
	public ResponseEntity<List<Booking>> getAllBookingsByUserId(@PathVariable("userid") Long userId) throws UserNotFoundException {
		return bookingService. getAllBookingsByUserId(userId);
	}
	
	@PostMapping("/booking/{userid}/user")
	public ResponseEntity<Booking> createBooking(@PathVariable("userid") Long userId,
			@RequestBody Booking newBooking) throws UserNotFoundException {
		return bookingService.createBooking(userId,newBooking);
		
	}
	

	
}
