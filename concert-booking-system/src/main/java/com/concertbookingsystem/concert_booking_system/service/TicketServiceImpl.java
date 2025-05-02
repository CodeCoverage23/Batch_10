package com.concertbookingsystem.concert_booking_system.service;

import static com.concertbookingsystem.concert_booking_system.constant.ConcertConstant.ENTERED;
import static com.concertbookingsystem.concert_booking_system.constant.ConcertConstant.EXITED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concertbookingsystem.concert_booking_system.dto.ConcertDetailsDto;
import com.concertbookingsystem.concert_booking_system.dto.TicketRequestDto;
import com.concertbookingsystem.concert_booking_system.repository.TicketRepository;
import com.concertbookingsystem.concert_booking_system.repository.entity.TicketEntity;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private ConcertService concertService;

	@Override
	public String bookTicket(long concertId, TicketRequestDto requestDto) {
		log.info(ENTERED);
		
		//Get concert by id
		ConcertDetailsDto concertDetails = concertService.getConcertById(concertId);
		
		//Check Ticket Availability
		Integer numberOfTickets = requestDto.getNumberOfTickets();
		
		if(concertDetails.getAvailableTickets() >= numberOfTickets) {
			TicketEntity ticketEntity = TicketEntity.builder()
					.concert_name(concertDetails.getConcertName())
					.name(requestDto.getName())
					.numberOfTickets(numberOfTickets).build();
			
			//Save The Ticket..
			ticketRepository.save(ticketEntity);
			
			//Update The Ticket Availability In Concert Table
			int ticketsAvailability = concertDetails.getAvailableTickets() - numberOfTickets;
			concertDetails.setAvailableTickets(ticketsAvailability);
			
			concertService.updateMethod(concertId, concertDetails);
		}
		else {
			//TODO :Throw Error Message For The User..
		}
		log.info(EXITED);

		return numberOfTickets + " Ticket Are Booked For You..!!";
	}

	@Override
	public List<TicketEntity> getAllBookings() {
		
		return ticketRepository.findAll();
	}
	
	
	
	
	
}
