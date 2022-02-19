package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
import com.mouritech.onlineflightticketbookingapplication.entity.Location1;
@Repository
public interface Location1Repository extends JpaRepository<Location1, Long> {
	List<Location1> findByLocation1Id(Long location1Id);
}
