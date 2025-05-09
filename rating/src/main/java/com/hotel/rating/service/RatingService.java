package com.hotel.rating.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.rating.entity.RatingEntity;

@Service
public interface RatingService {
	
	//save rating into DB
	RatingEntity saveRating(RatingEntity ratingEntity);
	
	//get all ratings
	List<RatingEntity> getRatings();
	
	//get all by user id
	List<RatingEntity> getRatingByUserId(String userId);
	
	//get all by hotel id
	List<RatingEntity> getRatingByHotelId(String hotelId);
	
	
}
