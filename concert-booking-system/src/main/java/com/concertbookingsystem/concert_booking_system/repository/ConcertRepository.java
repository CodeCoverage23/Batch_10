package com.concertbookingsystem.concert_booking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concertbookingsystem.concert_booking_system.repository.entity.ConcertEntity;


public interface ConcertRepository extends JpaRepository<ConcertEntity, Long>{

}
