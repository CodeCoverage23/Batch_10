package com.concertbookingsystem.controller;

import static com.concertbookingsystem.constant.ConcertConstant.ENTERED;
import static com.concertbookingsystem.constant.ConcertConstant.EXITED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.service.ConcertService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ConcertController {

	@Autowired
	private ConcertService concertService;

	/**
	 * An handler method for Add Concert API
	 * 
	 * @param concertDetailsDto The DTO
	 * @return The response
	 */
	@PostMapping("/v1/addConcert")
	public ResponseEntity<String> addConcert(@RequestBody ConcertDetailsDto concertDetailsDto) {
		log.info(ENTERED);
		String response = concertService.addConcert(concertDetailsDto);
		log.info(EXITED);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
