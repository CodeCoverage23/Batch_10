package com.concertbookingsystem.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ConcertDetailsDto {

	private Long id;
	private String concertName;
	private Double concertPrice;
	private int availableTickets;

}
