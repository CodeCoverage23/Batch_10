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
@Table(name = "table_ticket")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(name = "concert_name", nullable = false)
	private String concert_name;
	
	@Column(name = "number_of_tickets", nullable = false)
	private Integer numberOfTickets;
}
