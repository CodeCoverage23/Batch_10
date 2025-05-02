package com.concertbookingsystem.concert_booking_system.service;

import java.util.List;

import com.concertbookingsystem.concert_booking_system.dto.TicketRequestDto;
import com.concertbookingsystem.concert_booking_system.repository.entity.TicketEntity;

public interface TicketService {

	String bookTicket(long concertId, TicketRequestDto requestDto); 
	
	List<TicketEntity> getAllBookings();
	
}
