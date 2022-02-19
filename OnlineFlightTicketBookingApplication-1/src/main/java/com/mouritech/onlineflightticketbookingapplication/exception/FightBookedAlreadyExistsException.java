package com.mouritech.onlineflightticketbookingapplication.exception;

public class FightBookedAlreadyExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public FightBookedAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
}
