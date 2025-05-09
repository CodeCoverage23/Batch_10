package com.hotel.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.rating.entity.RatingEntity;
import com.hotel.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	//handler method for save the ratings
	@PostMapping("/create")
	public ResponseEntity<RatingEntity> saveToDB(@RequestBody RatingEntity ratingEntity){
		RatingEntity saveRating = ratingService.saveRating(ratingEntity);
		return new ResponseEntity<>(saveRating,HttpStatus.CREATED);
	}
	
	//handler method for fetch all data from DB
	@GetMapping("/all")
	public ResponseEntity<List<RatingEntity>> fetchAllRating(){
		List<RatingEntity> ratings = ratingService.getRatings();
		return new ResponseEntity<>(ratings,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all/{userId}")
	public ResponseEntity<List<RatingEntity>> fetchRatingByUserId(@PathVariable("userId")String id){
		List<RatingEntity> ratingByUserId = ratingService.getRatingByUserId(id);
		return new ResponseEntity<>(ratingByUserId,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<List<RatingEntity>> fetchRatingByHotelId(@PathVariable("hotelId")String id){
		 List<RatingEntity> ratingByHotelId = ratingService.getRatingByHotelId(id);
		return new ResponseEntity<>(ratingByHotelId,HttpStatus.ACCEPTED);
	}
	
	
	
}
