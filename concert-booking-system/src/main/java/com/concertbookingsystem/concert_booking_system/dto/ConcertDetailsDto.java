package com.concertbookingsystem.concert_booking_system.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ConcertDetailsDto {

	private Long id;
	private String concertName;
	private Double concertPrice;
	private int availableTickets;

}
