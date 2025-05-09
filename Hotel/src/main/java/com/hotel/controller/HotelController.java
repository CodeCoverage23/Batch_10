package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Entity.HotelEntity;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	
	// handle create request
	@PostMapping("/create")
	public ResponseEntity<HotelEntity> createHotelInfo(@RequestBody HotelEntity hotelEntity){
		ResponseEntity<HotelEntity> hotelData = hotelService.createHotelData(hotelEntity);
		return hotelData;
	}

	@GetMapping("/all")
	public ResponseEntity<List<HotelEntity>> getAllHotel() 
	{
		
		ResponseEntity<List<HotelEntity>> allData = hotelService.getAllData();
		
		return allData;
	}
	
	@GetMapping("/get/{hotelId}")
	public ResponseEntity<HotelEntity> getHotelById(@PathVariable String hotelId){
		
		ResponseEntity<HotelEntity> hotelDataById = hotelService.getHotelDataById(hotelId);
		
		return hotelDataById;
	}
	
	@PutMapping("/update")
	public ResponseEntity<HotelEntity> UpdatehotelData(@RequestBody HotelEntity hotelEntity)
	{
		ResponseEntity<HotelEntity> updateExistingHotelData = hotelService.updateExistingHotelData(hotelEntity);
		
		return updateExistingHotelData;
	}
	
}
