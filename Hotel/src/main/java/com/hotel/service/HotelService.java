package com.hotel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hotel.Entity.HotelEntity;

public interface HotelService {

	//create a hotel data 
	public ResponseEntity<HotelEntity> createHotelData( HotelEntity hotel);
	
	public ResponseEntity<List<HotelEntity>> getAllData();
	
	public ResponseEntity<HotelEntity> getHotelDataById(String hotelId);
	
	
	public ResponseEntity<HotelEntity> updateExistingHotelData( HotelEntity hotel);
	
	
}
