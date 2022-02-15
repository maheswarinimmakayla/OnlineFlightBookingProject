package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingDateAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepository  bookingRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public Booking insertBooking(Booking newBooking) {
		newBooking.setBookingId(generateBookingId());
		return bookingRepository.save(newBooking);
	}
	public String generateBookingId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	        //generate random values from 0-254
	      Long pId = (long) rand.nextInt(upperbound);
		return "B00" + pId; 
	
	}
	@Override
	public Booking showBookingById(String bookingId) throws BookingNotFoundException {
		return bookingRepository.findByBookingId(bookingId).orElseThrow(() -> new BookingNotFoundException("booking not found with id " + bookingId));
	}
	@Override
	public List<Booking> showAllBookings() {
		return bookingRepository.findAll();
	}
	@Override
	public Booking updateBookingById(String bookingId, Booking booking) throws BookingNotFoundException {
		Booking existingBooking = bookingRepository.findByBookingId(bookingId).orElseThrow(() -> new BookingNotFoundException("booking not found with id " + bookingId));
		existingBooking.setBookingDate(booking.getBookingDate());
		existingBooking.setTotalCost(booking.getTotalCost());
		bookingRepository.save(existingBooking);
		return existingBooking;
	}
	@Override
	public void deleteBookingById(String bookingId) throws BookingNotFoundException {
		Booking existingBooking = bookingRepository.findByBookingId(bookingId).orElseThrow(() -> new BookingNotFoundException("booking not found with id " + bookingId));
		bookingRepository.delete(existingBooking);
		
	}
	@Override
	public ResponseEntity<List<Booking>> getAllBookingsByUserId(Long userId) throws UserNotFoundException {
		if(!userRepository.existsById(userId)) {
			throw new UserNotFoundException("User not found with id = "  + userId);
		}
		List<Booking> bookings = bookingRepository.findByUser(userId);
		return new ResponseEntity<List<Booking>>(bookings,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Booking> createBooking(Long userId, Booking newBooking) throws UserNotFoundException {
	
	Booking booking = userRepository.findById(userId).map(
				user ->{
					newBooking.setUser(user);
					newBooking.setBookingId(generateBookingId());
					return bookingRepository.save(newBooking);
					
				}).orElseThrow(()-> new UserNotFoundException("user not found with id = "  + userId));
		return new ResponseEntity<Booking>(newBooking,HttpStatus.CREATED);
	}

	@Override
	public Booking getBookingDateByUser(Long userId, Date bookingDate) throws BookingDateAlreadyExistsException {
		return 
				bookingRepository.findByBookingDateAndUser(userId, bookingDate).
				orElseThrow(() -> new BookingDateAlreadyExistsException("Booking already exists with the name = " + bookingDate));
	}
	
}