package com.mouritech.onlineflightticketbookingapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "flight_info")
@EntityListeners(AuditingEntityListener.class)
public class Flight {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id", length = 64)
	private String flightId;
	
	@Column(name = "fleet")
	private String fleet;
	
	@Column(name = "departure_Loc")
	private String departureLoc;
	
	@Column(name = "remaing_Seats")
	private Long remaingSeats;
	
	@Column(name = "fare")
	private String fare;
	
	@Column(name = "arrival_Loc")
	private String arrivalLoc;
	
	@Column(name = "total_Seats")
	private Long totalSeats;
	
	public Flight(String fleet, String departureLoc, Long remaingSeats, String fare, String arrivalLoc,
			Long totalSeats) {
		super();
		this.fleet = fleet;
		this.departureLoc = departureLoc;
		this.remaingSeats = remaingSeats;
		this.fare = fare;
		this.arrivalLoc = arrivalLoc;
		this.totalSeats = totalSeats;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="location_id",nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	
   public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFleet() {
		return fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
	}

	public String getDepartureLoc() {
		return departureLoc;
	}

	public void setDepartureLoc(String departureLoc) {
		this.departureLoc = departureLoc;
	}

	public Long getRemaingSeats() {
		return remaingSeats;
	}

	public void setRemaingSeats(Long remaingSeats) {
		this.remaingSeats = remaingSeats;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}

	public Long getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Long totalSeats) {
		this.totalSeats = totalSeats;
	}

	

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", fleet=" + fleet + ", departureLoc=" + departureLoc
				+ ", remaingSeats=" + remaingSeats + ", fare=" + fare + ", arrivalLoc=" + arrivalLoc + ", totalSeats="
				+ totalSeats + "]";
	}

	
	
	
	
}
