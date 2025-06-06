package com.concertbookingsystem.controller;

import static com.concertbookingsystem.constant.ConcertConstant.EXITED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.concertbookingsystem.dto.TicketRequestDto;
import com.concertbookingsystem.repository.entity.TicketEntity;
import com.concertbookingsystem.service.TicketService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping("/bookTicket/{concertId}")
	public ResponseEntity<String> bookTicket(@PathVariable long concertId, @RequestBody TicketRequestDto requestDto) {
		log.info("Concert Id to book the ticket : {}", concertId);

		String response = ticketService.bookTicket(concertId, requestDto);

		log.info(EXITED);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/tickets")
	public List<TicketEntity> getAllBookings() {
		return ticketService.getAllBookings();
	}

}
