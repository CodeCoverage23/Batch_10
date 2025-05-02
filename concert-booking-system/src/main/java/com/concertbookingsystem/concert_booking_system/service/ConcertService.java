package com.concertbookingsystem.concert_booking_system.service;

import java.util.List;

import com.concertbookingsystem.concert_booking_system.dto.ConcertDetailsDto;

//An interface to provide concert related operations..

public interface ConcertService {
	
	/**
	 * It will add the data in database
	 * 
	 * @param concertDetailsDto The DTO
	 * @return The String
	 */
	
	String addConcert(ConcertDetailsDto concertDetailsDto);
	
	/*
	 * Returns all the concerts from DB
	 * @return The list of (@link concertDetailsDto)
	 */
	List<ConcertDetailsDto> getAllConcerts();
	
	
	/*
	 * Returns DTO associated with Id
	 * 
	 * @param id the Id
	 * @return Response
	 */
	ConcertDetailsDto getConcertById(long id);
	
	/**
	 * Update the concert details int a DB
	 * 
	 * @param concertId The Concert ID
	 * @param detailsDto The Request DTO
	 * @return Concert Details DTO Response
	 */
	ConcertDetailsDto updateMethod(long concertId , ConcertDetailsDto detailsDto);

	/**
	 * It Will Delete The Concert Associated With the Id
	 * 
	 * @param id The Concert Id
	 */
	void deleteConcertById(long id);
}
