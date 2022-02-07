package com.mouritech.onlineflightticketbookingsystem.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onlineflightticketbookingsystem.entity.Booking;
import com.mouritech.onlineflightticketbookingsystem.util.HibernateUtil;

public class BookingRepository {
	public List<Booking> getAllBooking() {
		
		Transaction transaction = null;
		List<Booking> bookingList = null;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
			
			// start the transaction
			transaction = session.beginTransaction();
			
			
			//get entity from database
			bookingList = session.createQuery("from Booking").getResultList();
	
			//commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return bookingList;
	}



public Booking addBooking(Booking booking) {
	Transaction transaction = null;
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
	
		
		// start the transaction
		transaction = session.beginTransaction();
		// save the employee object in to database
		session.save(booking);
		// commit transaction
		transaction.commit();
	}catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}

		e.printStackTrace();
	}
	return booking;
}

public String deleteBooking(int bookingid) {
	// TODO Auto-generated method stub
	return null;
}

public Booking updateBooking(int bookingid, Booking booking) {
	// TODO Auto-generated method stub
	return null;
}

public Booking getBookingById(int bookingid) {
	// TODO Auto-generated method stub
	return null;
}





}
