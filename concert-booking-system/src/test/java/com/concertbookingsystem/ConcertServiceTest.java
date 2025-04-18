package com.concertbookingsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.exception.ConcertSystemException;
import com.concertbookingsystem.repository.ConcertRepository;
import com.concertbookingsystem.repository.entity.ConcertEntity;
import com.concertbookingsystem.service.ConcertService;

@SpringBootTest
class ConcertServiceTest {

	@Autowired
	private ConcertService concertService;

	@MockitoBean
	private ConcertRepository concertRepository;

	@Test
	void testGetAllConcerts() {
		ConcertEntity concertEntity = ConcertEntity.builder().id(0L).build();
		ConcertEntity concertEntity2 = ConcertEntity.builder().id(2L).build();
		when(concertRepository.findAll()).thenReturn(List.of(concertEntity, concertEntity2));
		List<ConcertDetailsDto> allConcerts = concertService.getAllConcerts();
		assertEquals(2, allConcerts.size());
	}

	@Test
	void testAddConcert() {
		ConcertDetailsDto concertDetailsDto = ConcertDetailsDto.builder().concertName("Name").concertPrice(10D)
				.availableTickets(5).build();
		String concert = concertService.addConcert(concertDetailsDto);
		assertEquals("Succesfully Saved", concert);
	}

	@Test
	void testConcertById() {
		ConcertEntity concertEntity = ConcertEntity.builder().id(0L).build();
		when(concertRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(concertEntity));
		ConcertDetailsDto concertById = concertService.getConcertById(0);
		assertNotNull(concertById);
	}

	@Test
	void testConcertById_Exception() {
		ConcertSystemException assertThrows = Assertions.assertThrows(ConcertSystemException.class,
				() -> concertService.getConcertById(0));
		assertNotNull(assertThrows);
	}

}
