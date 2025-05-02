package com.concertbookingsystem.concert_booking_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ConcertSystemException.class)
	public ResponseEntity<String> handleConcertServiceException(ConcertSystemException exception){
		return new ResponseEntity<String>(exception.getErrorMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRuntimeException(RuntimeException exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
