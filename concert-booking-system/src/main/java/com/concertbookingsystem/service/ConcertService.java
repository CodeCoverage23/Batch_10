package com.concertbookingsystem.service;

import java.util.List;

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

	/**
	 * Returns all the concerts from DB
	 * 
	 * @return The list of {@link ConcertDetailsDto}
	 */
	List<ConcertDetailsDto> getAllConcerts();

	/**
	 * Returns DTO associated with ID
	 * 
	 * @param id The ID
	 * @return Response
	 */
	ConcertDetailsDto getConcertById(long id);

	/**
	 * Update the concert details into the DB
	 * 
	 * @param concertId  The Concert ID
	 * @param detailsDto The Request DTO
	 * @return Concert details DTO response
	 */
	ConcertDetailsDto updateConcert(long concertId, ConcertDetailsDto detailsDto);

	/**
	 * It will delete the concert associated with the id
	 * 
	 * @param id The concert Id
	 */
	void deleteConcertId(long id);

}
