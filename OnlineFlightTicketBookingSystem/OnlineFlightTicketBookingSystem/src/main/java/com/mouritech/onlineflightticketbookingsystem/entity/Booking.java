package com.mouritech.onlineflightticketbookingsystem.entity;

import javax.xml.ws.ServiceMode;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private int bookingId;
	private Date bookingDate;
	private Long totalCost;
	private String filghtBooked;
	private Date travellDate;
	public Booking() {
		
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Long getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Long totalCost) {
		this.totalCost = totalCost;
	}
	public String getFilghtBooked() {
		return filghtBooked;
	}
	public void setFilghtBooked(String filghtBooked) {
		this.filghtBooked = filghtBooked;
	}
	public Date getTravellDate() {
		return travellDate;
	}
	public void setTravellDate(Date travellDate) {
		this.travellDate = travellDate;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", totalCost=" + totalCost
				+ ", filghtBooked=" + filghtBooked + ", travellDate=" + travellDate + "]";
	}
}
