package com.concertbookingsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ConcertSystemException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private String errorMessage;
	
}
