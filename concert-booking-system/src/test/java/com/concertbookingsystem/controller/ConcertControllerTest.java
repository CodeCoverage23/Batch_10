package com.concertbookingsystem.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.concertbookingsystem.dto.ConcertDetailsDto;
import com.concertbookingsystem.service.ConcertService;

@SpringBootTest
class ConcertControllerTest {

	@Autowired
	private ConcertController concertController;

	@MockitoBean
	private ConcertService concertService;

	@Test
	void testAddConcert() {
		ConcertDetailsDto concertDetailsDto = ConcertDetailsDto.builder().concertName("Name").concertPrice(10D)
				.availableTickets(5).build();
		Mockito.when(concertService.addConcert(Mockito.any())).thenReturn("Saved");
		ResponseEntity<String> concert = concertController.addConcert(concertDetailsDto);
		Assertions.assertEquals("Saved", concert.getBody());
		Assertions.assertEquals(HttpStatus.CREATED, concert.getStatusCode());
	}

	@Test
	void testGetConcertById() {
		ConcertDetailsDto concertDetailsDto = ConcertDetailsDto.builder().id(1L).concertName("Name").concertPrice(10D)
				.availableTickets(5).build();
		Mockito.when(concertService.getConcertById(Mockito.anyLong())).thenReturn(concertDetailsDto);
		ResponseEntity<ConcertDetailsDto> concertById = concertController.getConcertById(1);
		ConcertDetailsDto detailsDto = concertById.getBody();
		Assertions.assertNotNull(detailsDto);
		Assertions.assertEquals(HttpStatusCode.valueOf(200), concertById.getStatusCode());
	}

	@Test
	void testDeleteConcert() {
		Mockito.doNothing().when(concertService).deleteConcertId(Mockito.anyLong());
		ResponseEntity<String> concert = concertController.deleteConcertId(1);
		Assertions.assertEquals(HttpStatus.OK, concert.getStatusCode());
		Assertions.assertTrue(concert.getStatusCode().is2xxSuccessful());
	}

}
