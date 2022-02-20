package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
@Repository
public interface LocationRepository  extends JpaRepository<Location, Long>{

	List<Location> findByLocationId(Long locationId);
	List<Location> findByOnWordDate(Long locationId);

}
