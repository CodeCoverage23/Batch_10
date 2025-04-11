package com.concertbookingsystem.service;

import com.concertbookingsystem.dto.ConcertDetailsDto;

/**
 * An interface to provide concert related operations
 */
public interface ConcertService {

	/**
	 * It will add the data in database
	 * 
	 * @param concertDetailsDto The DTO
	 * @return The String
	 */
	String addConcert(ConcertDetailsDto concertDetailsDto);

}
