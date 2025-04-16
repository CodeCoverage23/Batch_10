package com.concertbookingsystem.service;

import static com.concertbookingsystem.constant.ConcertConstant.ENTERED;
import static com.concertbookingsystem.constant.ConcertConstant.EXITED;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.concertbookingsystem.ConcertBookingSystemApplication;
import com.concertbookingsystem.constant.ConcertConstant;
import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.exception.ConcertSystemException;
import com.concertbookingsystem.repository.ConcertRepository;
import com.concertbookingsystem.repository.entity.ConcertEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

/**
 * Provides an implementation for {@link ConcertService}
 */
@Service
@Log4j2
public class ConcertServiceImpl implements ConcertService {

	private final ConcertBookingSystemApplication concertBookingSystemApplication;

	@Autowired
	private ConcertRepository concertRepository;
	@Autowired
	private ObjectMapper mapper;

	ConcertServiceImpl(ConcertBookingSystemApplication concertBookingSystemApplication) {
		this.concertBookingSystemApplication = concertBookingSystemApplication;
	}

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

	@Override
	public List<ConcertDetailsDto> getAllConcerts() {
		log.info(ENTERED);
		List<ConcertEntity> concertEntities = concertRepository.findAll();
		List<ConcertDetailsDto> response = concertEntities.stream()
				.map(concert -> mapper.convertValue(concert, ConcertDetailsDto.class)).toList();
		log.info(EXITED);
		return response;
	}

	@Override
	public ConcertDetailsDto getConcertById(long id) {
		log.info(ENTERED);
		Optional<ConcertEntity> concert = concertRepository.findById(id);
		if (concert.isEmpty()) {
			log.info(ConcertConstant.NO_CONCERT_AVAILABLE, id);
			throw new ConcertSystemException("Concert Not found");
		}
		ConcertEntity concertEntity = concert.get();

		ConcertDetailsDto concertDetailsDto = ConcertDetailsDto.builder().id(concertEntity.getId())
				.concertName(concertEntity.getConcertName()).availableTickets(concertEntity.getAvailableTickets())
				.concertPrice(concertEntity.getConcertPrice()).build();
		log.info(EXITED);
		return concertDetailsDto;
	}

}
