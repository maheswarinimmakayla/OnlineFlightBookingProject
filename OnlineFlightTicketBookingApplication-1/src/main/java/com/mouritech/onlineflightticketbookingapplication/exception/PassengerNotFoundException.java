package com.mouritech.onlineflightticketbookingapplication.exception;

public class PassengerNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public PassengerNotFoundException(String message) {
		super(message);
	}
}
