package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingDateAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;



public interface BookingService {
	
	Booking insertBooking(Booking newBooking);
    
	Booking showBookingById(String bookingId) throws BookingNotFoundException;

	List<Booking> showAllBookings();

	Booking updateBookingById(String bookingId, Booking booking) throws BookingNotFoundException;

	void deleteBookingById(String bookingId) throws BookingNotFoundException;

	 
	ResponseEntity<List<Booking>> getAllBookingsByUserId(Long userId) throws UserNotFoundException;
	ResponseEntity<Booking> createBooking(Long userId, Booking newBooking) throws UserNotFoundException;



	

	Booking getBookingDateByUser(Long userId, Date bookingDate) throws BookingDateAlreadyExistsException;

}
