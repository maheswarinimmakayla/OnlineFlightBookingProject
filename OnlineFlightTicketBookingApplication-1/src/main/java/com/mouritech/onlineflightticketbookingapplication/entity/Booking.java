package com.mouritech.onlineflightticketbookingapplication.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "booking_info")
@EntityListeners(AuditingEntityListener.class)
public class Booking {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id",length = 64)
	private String bookingId;
	
	@Column(name = "booking_date", unique = true)
	@LastModifiedDate
	private Date bookingDate;
	
	@Column(name = "travel_date")
	@LastModifiedDate
	private Date travelDate;
	
	@Column(name = "total_cost")
	private Long totalCost;

	@Column(name = "fight_booked")
	private String fightBooked;
	
	
	public Booking() {
		
	}

	public Booking(Date bookingDate, Date travelDate, Long totalCost, String fightBooked, User user) {
		super();
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.totalCost = totalCost;
		this.fightBooked = fightBooked;
		this.user = user;
	}

   public Booking(Date bookingDate, Long totalCost) {
		super();
		this.bookingDate = bookingDate;
		this.totalCost = totalCost;
	}

	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="user_id",nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	
	private User user;
	
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_id")
	private Passenger passenger;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Long totalCost) {
		this.totalCost = totalCost;
	}

	public String getFightBooked() {
		return fightBooked;
	}

	public void setFightBooked(String fightBooked) {
		this.fightBooked = fightBooked;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", travelDate=" + travelDate
				+ ", totalCost=" + totalCost + ", fightBooked=" + fightBooked + "]";
	}

	
	
	
	

}
