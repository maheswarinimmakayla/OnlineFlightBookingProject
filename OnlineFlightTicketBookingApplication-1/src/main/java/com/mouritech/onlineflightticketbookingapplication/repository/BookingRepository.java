package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

        Optional<Booking> findByBookingId(String bookingId);
		List<Booking> findByBookingDate(String bookingId);
		Optional<Booking> findByBookingDateAndUser(Long userId,Date bookingDate);
		List<Booking> findByUser(Long userId);
		
	
		
		
}
