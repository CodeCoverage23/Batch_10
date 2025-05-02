package com.concertbookingsystem.concert_booking_system.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "table_concert")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConcertEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "concert_name" , nullable = false)
	private String concertName;
	
	@Column(name = "concert_price")
	private Double concertPrice;
	
	@Column(name = "available_tickets" , nullable = false)
	private int availableTickets;

}
