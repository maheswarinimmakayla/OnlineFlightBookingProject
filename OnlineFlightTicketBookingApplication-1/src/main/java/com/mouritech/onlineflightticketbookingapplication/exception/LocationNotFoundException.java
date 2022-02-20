package com.mouritech.onlineflightticketbookingapplication.exception;

public class LocationNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;

	public LocationNotFoundException(String message) {
		super(message);
	}

//	public LocationNotFoundException(Long locationId) {
//		super();
//	}
}
