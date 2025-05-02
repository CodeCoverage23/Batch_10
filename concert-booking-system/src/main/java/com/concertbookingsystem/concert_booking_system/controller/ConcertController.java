package com.concertbookingsystem.concert_booking_system.controller;

import static com.concertbookingsystem.concert_booking_system.constant.ConcertConstant.EXITED;

import java.util.List;

import static com.concertbookingsystem.concert_booking_system.constant.ConcertConstant.ENTERED;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concertbookingsystem.concert_booking_system.dto.ConcertDetailsDto;
import com.concertbookingsystem.concert_booking_system.service.ConcertService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/v1")
public class ConcertController {
	
	@Autowired
	private ConcertService concertService;
	
	/**
	 * An handler method for addConcert API
	 * @param concertDetailsDto The DTO
	 * @return The response
	 */
	@PostMapping("/addConcert")
	public ResponseEntity<String> addConcert(@RequestBody ConcertDetailsDto concertDetailsDto){
		log.info(ENTERED);
		String response = concertService.addConcert(concertDetailsDto);
		log.info(EXITED);	
		return new ResponseEntity<>(response , HttpStatus.CREATED);
	}
	
	@GetMapping("/concerts")
	public List<ConcertDetailsDto> getAllConcerts(){
		log.info(ENTERED);
		List<ConcertDetailsDto> allConcerts = concertService.getAllConcerts();		
		log.info(EXITED);
		return allConcerts;
	}
	
	
	/*
	 * An Handler method to get concert by id.
	 * 
	 * @param id The Integer Value
	 * @return The response {@link ConcertDetailsDto}
	 * 
	 */
	@GetMapping("/concert/{id}")
	public ResponseEntity<ConcertDetailsDto> getConcertById(@PathVariable int id){
		log.info(ENTERED);
		ConcertDetailsDto concertById = concertService.getConcertById(id);
		log.info(EXITED);	
		return ResponseEntity.ok(concertById);


	}
	
	@PutMapping("/concert/{id}")
	public ConcertDetailsDto updateConcert(@PathVariable("id") long concerId, @RequestBody ConcertDetailsDto detailsDto) {
		log.info(ENTERED);
		
		ConcertDetailsDto dto = concertService.updateMethod(concerId, detailsDto);
		
		log.info(EXITED);
		return dto;

	}
	
	
	/**
	 * An Handler Method To Delete The Concert
	 * @param id The Concert Id
	 * @returnString Response
	 */
	
	
	@DeleteMapping("/concert/{id}")
	public ResponseEntity<String> deleteConcertById(@PathVariable long id){
		log.info(ENTERED);
		concertService.deleteConcertById(id);
		log.info(EXITED);	
		return ResponseEntity.ok("Concert Deleted..");
	}

}
