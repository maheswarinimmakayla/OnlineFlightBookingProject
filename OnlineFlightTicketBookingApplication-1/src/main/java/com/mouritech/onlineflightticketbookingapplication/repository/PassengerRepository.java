package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Passenger;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{
//	 Optional<Passenger> findByPassengerId(String passengerId);
//		List<Passenger> findByFirstName(String firstName);
//		
//		Optional<Passenger> findByFirstNameAndBooking(String bookingId,String firstName);
//		List<Passenger> findByBooking(String bookingId);
		
		List<User> findByPassengerId(Long passengerId);
}
