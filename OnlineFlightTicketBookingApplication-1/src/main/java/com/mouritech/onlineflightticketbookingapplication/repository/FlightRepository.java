package com.mouritech.onlineflightticketbookingapplication.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

    Optional<Flight> findByFlightId(String flightId);
	List<Flight> findByFleet(String fleet);
	
//	Optional<Flight> findByFleetAndLocation(Long locationId,String fleet);
//	List<Flight> findByLocation(Long locationId);

}
