package com.concertbookingsystem.concert_booking_system.service;

import static com.concertbookingsystem.concert_booking_system.constant.ConcertConstant.EXITED;
import static com.concertbookingsystem.concert_booking_system.constant.ConcertConstant.ENTERED;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concertbookingsystem.concert_booking_system.constant.ConcertConstant;
import com.concertbookingsystem.concert_booking_system.dto.ConcertDetailsDto;
import com.concertbookingsystem.concert_booking_system.exception.ConcertSystemException;
import com.concertbookingsystem.concert_booking_system.repository.ConcertRepository;
import com.concertbookingsystem.concert_booking_system.repository.entity.ConcertEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;


//Provides An Implementation for {@link ConcertService}

@Service
@Log4j2
public class ConcertServiceImpl implements ConcertService{
	
	

	@Autowired
	private ConcertRepository concertRepository;
	
	@Autowired
	private ObjectMapper mapper;
	
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
		if(concert.isEmpty()) {
			log.info(ConcertConstant.NO_CONCERT_AVAILABLE,id);

			throw new ConcertSystemException("Concert Not Found");
		}
		ConcertEntity concertEntity = concert.get();
		
		ConcertDetailsDto concertDetailsDto = constructConcertDto(concertEntity);

		log.info(EXITED);

		return concertDetailsDto;
	}

	private ConcertDetailsDto constructConcertDto(ConcertEntity concertEntity) {
		ConcertDetailsDto concertDetailsDto = ConcertDetailsDto.builder().id(concertEntity.getId())
		.concertName(concertEntity.getConcertName()).availableTickets(concertEntity.getAvailableTickets())
		.concertPrice(concertEntity.getConcertPrice()).build();
		return concertDetailsDto;
	}

	@Override
	public ConcertDetailsDto updateMethod(long concertId, ConcertDetailsDto detailsDto) {
		log.info(ENTERED);
		Optional<ConcertEntity> concert = concertRepository.findById(concertId);
		if(concert.isEmpty()) {
			log.info(ConcertConstant.NO_CONCERT_AVAILABLE,concertId);

			throw new ConcertSystemException("Invalid Id Found, Please Provide Another Concert Id.");
		}
		
		ConcertEntity concertEntity = concert.get();
		
		concertEntity.setConcertName(detailsDto.getConcertName());
		concertEntity.setConcertPrice(detailsDto.getConcertPrice());
		concertEntity.setAvailableTickets(detailsDto.getAvailableTickets());
		
		ConcertEntity updatedEntity = concertRepository.save(concertEntity);

		log.info(EXITED);
		return constructConcertDto(updatedEntity);
	}

	@Override
	public void deleteConcertById(long id) {
		log.info(ENTERED);
		concertRepository.deleteById(id);		
		log.info(EXITED);

	}
}
