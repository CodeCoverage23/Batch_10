package com.hotel.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hotel.Entity.HotelEntity;
import com.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelrepo;

	@Override
	public ResponseEntity<HotelEntity> createHotelData(HotelEntity hotel) {
        String randomId = UUID.randomUUID().toString();
        hotel.setHotelId(randomId);
        HotelEntity save = hotelrepo.save(hotel);
		return new ResponseEntity<HotelEntity>(save, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<HotelEntity>> getAllData() {
		
		List<HotelEntity> all = hotelrepo.findAll();
		return  new ResponseEntity<List<HotelEntity>>(all, HttpStatus.OK) ;
	}

	@Override
	public ResponseEntity<HotelEntity> getHotelDataById(String hotelId) {
		
		Optional<HotelEntity> optionalId = hotelrepo.findById(hotelId);
		HotelEntity hotelEntity = optionalId.get();		
		
		return new ResponseEntity<HotelEntity>(hotelEntity, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<HotelEntity> updateExistingHotelData(HotelEntity hotel) {
		
		Optional<HotelEntity> optionalId = hotelrepo.findById(hotel.getHotelId());
		HotelEntity hotelEntity = optionalId.get();	
		hotelEntity.setHotelName(hotel.getHotelName());
		hotelEntity.setHotelLocation(hotel.getHotelLocation());
		hotelEntity.setAbout(hotel.getAbout());
		HotelEntity save = hotelrepo.save(hotelEntity);
		
		return new ResponseEntity<HotelEntity>(save, HttpStatus.OK);
	}
	
	
	
	
	
	

}
