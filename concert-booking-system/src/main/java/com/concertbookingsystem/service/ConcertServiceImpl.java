package com.concertbookingsystem.service;

import static com.concertbookingsystem.constant.ConcertConstant.EXITED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concertbookingsystem.constant.ConcertConstant;
import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.repository.ConcertRepository;
import com.concertbookingsystem.repository.entity.ConcertEntity;

import lombok.extern.log4j.Log4j2;

/**
 * Provides an implementation for {@link ConcertService}
 */
@Service
@Log4j2
public class ConcertServiceImpl implements ConcertService {

	@Autowired
	private ConcertRepository concertRepository;

	@Override
	public String addConcert(ConcertDetailsDto concertDetailsDto) {
		log.info(ConcertConstant.CONCERT_DETAILS, concertDetailsDto);

		ConcertEntity concertEntity = ConcertEntity.builder().concertName(concertDetailsDto.getConcertName())
				.concertPrice(concertDetailsDto.getConcertPrice())
				.availableTickets(concertDetailsDto.getAvailableTickets()).build();

		concertRepository.save(concertEntity);
		log.info(EXITED);
		return "Succesfully Saved";
	}

}
