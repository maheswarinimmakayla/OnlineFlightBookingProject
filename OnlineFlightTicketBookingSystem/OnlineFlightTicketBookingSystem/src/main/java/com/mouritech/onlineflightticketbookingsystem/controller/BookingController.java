package com.mouritech.onlineflightticketbookingsystem.controller;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mouritech.onlineflightticketbookingsystem.entity.Booking;
import com.mouritech.onlineflightticketbookingsystem.service.BookingService;


@Path("api/v1/booking")
public class BookingController {
	BookingService bookingService = new BookingService();
	
	@Path("/getallbooking")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Booking> getAllBooking(){
		return bookingService.getAllBooking();
	}
	
	@Path("/getbookingbyid/{bookingid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Booking getBookingById(@PathParam("bookingid") int bookingid){
		return bookingService.getBookingById(bookingid);
	}
	
	@Path("/addbooking")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Booking addBooking(Booking booking){
		return bookingService.addBooking(booking);
	}
	
	@Path("/deletebooking/{bookingid}")
	@DELETE
	public String deleteBooking(@PathParam("bookingid") int bookingid){
		return bookingService.deleteBooking(bookingid);
	}
	
	@Path("/updatebooking/{bookingid}")
	@PUT
	public Booking updateBooking(@PathParam("bookingid") int bookingid,Booking booking){
		return bookingService.updateBooking(bookingid,booking);
	}
}

