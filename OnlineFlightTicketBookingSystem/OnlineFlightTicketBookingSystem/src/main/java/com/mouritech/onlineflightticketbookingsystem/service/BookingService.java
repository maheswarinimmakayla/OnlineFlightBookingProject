package com.mouritech.onlineflightticketbookingsystem.service;

import java.util.List;

import com.mouritech.onlineflightticketbookingsystem.entity.Booking;
import com.mouritech.onlineflightticketbookingsystem.repository.BookingRepository;

public class BookingService {
	BookingRepository bookingRepository = new BookingRepository();
public List<Booking> getAllBooking() {
		
		return bookingRepository.getAllBooking();
	}

	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.addBooking(booking);
	}

	public String deleteBooking(int bookingid) {
		// TODO Auto-generated method stub
		return bookingRepository.deleteBooking(bookingid);
	}

	public Booking updateBooking(int bookingid,Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.updateBooking(bookingid,booking);
	}

	public Booking getBookingById(int bookingid) {
		// TODO Auto-generated method stub
		return bookingRepository.getBookingById(bookingid);
	}
}
