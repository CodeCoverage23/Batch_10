package com.concertbookingsystem.concert_booking_system.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ConcertSystemException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;

}
