package com.concertbookingsystem.service;

import java.util.List;

import com.concertbookingsystem.dto.TicketRequestDto;
import com.concertbookingsystem.repository.entity.TicketEntity;

public interface TicketService {

	String bookTicket(long concertId, TicketRequestDto requestDto);

	List<TicketEntity> getAllBookings();

}
