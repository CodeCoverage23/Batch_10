package com.concertbookingsystem.controller;

import static com.concertbookingsystem.constant.ConcertConstant.ENTERED;
import static com.concertbookingsystem.constant.ConcertConstant.EXITED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.service.ConcertService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/v1")
public class ConcertController {

	@Autowired
	private ConcertService concertService;

	/**
	 * An handler method for Add Concert API
	 * 
	 * @param concertDetailsDto The DTO
	 * @return The response
	 */
	@PostMapping("/addConcert")
	public ResponseEntity<String> addConcert(@RequestBody ConcertDetailsDto concertDetailsDto) {
		log.info(ENTERED);
		String response = concertService.addConcert(concertDetailsDto);
		log.info(EXITED);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping("/concerts")
	public List<ConcertDetailsDto> getAllConcerts() {
		log.info(ENTERED);
		List<ConcertDetailsDto> allConcerts = concertService.getAllConcerts();
		log.info(EXITED);
		return allConcerts;
	}

	/**
	 * An handler method to get the concert by id
	 * 
	 * @param id The Integer value
	 * @return The response {@link ConcertDetailsDto}
	 */
	@GetMapping("/concert/{id}")
	public ResponseEntity<ConcertDetailsDto> getConcertById(@PathVariable int id) {
		log.info(ENTERED);
		ConcertDetailsDto concertById = concertService.getConcertById(id);
		log.info(EXITED);
		return ResponseEntity.ok(concertById);
	}

}
