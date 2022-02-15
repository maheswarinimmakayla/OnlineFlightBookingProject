package com.mouritech.onlineflightticketbookingapplication.exception;

public class BookingDateAlreadyExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public BookingDateAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
}
