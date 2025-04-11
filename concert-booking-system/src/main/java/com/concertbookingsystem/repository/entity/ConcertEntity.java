package com.concertbookingsystem.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "table_concert")
@Builder
@Getter
@Setter
public class ConcertEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "concert_name", nullable = false)
	private String concertName;

	@Column(name = "concert_price")
	private Double concertPrice;

	@Column(name = "available_tickets", nullable = false)
	private int availableTickets;

}
