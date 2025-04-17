package com.concertbookingsystem.service;

import static com.concertbookingsystem.constant.ConcertConstant.ENTERED;
import static com.concertbookingsystem.constant.ConcertConstant.EXITED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.dto.TicketRequestDto;
import com.concertbookingsystem.repository.TicketRepository;
import com.concertbookingsystem.repository.entity.TicketEntity;

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

		// get concert by id
		ConcertDetailsDto concertDetails = concertService.getConcertById(concertId);

		// check ticket availability
		Integer numberOfTickets = requestDto.getNumberOfTickets();
		if (concertDetails.getAvailableTickets() >= numberOfTickets) {

			TicketEntity ticketEntity = TicketEntity.builder().concertName(concertDetails.getConcertName())
					.name(requestDto.getName()).numberOfTickets(numberOfTickets).build();
			// save the tickets
			ticketRepository.save(ticketEntity);

			// update the tickets availability in concert table
			int ticketsAvailability = concertDetails.getAvailableTickets() - numberOfTickets;
			concertDetails.setAvailableTickets(ticketsAvailability);

			concertService.updateConcert(concertId, concertDetails);

		} else {
			// TODO : Throw error message for the user
		}

		log.info(EXITED);
		return numberOfTickets + " ticket are booked for You..!";
	}

	@Override
	public List<TicketEntity> getAllBookings() {
		return ticketRepository.findAll();
	}

}
