package com.concertbookingsystem.concert_booking_system.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.concertbookingsystem.concert_booking_system.repository.entity.TicketEntity;


@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Long> {

}