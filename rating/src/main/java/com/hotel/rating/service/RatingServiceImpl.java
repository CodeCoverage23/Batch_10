package com.hotel.rating.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.rating.entity.RatingEntity;
import com.hotel.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	RatingRepository ratingRepository;
	
	@Override
	public RatingEntity saveRating(RatingEntity ratingEntity) {
		String string = UUID.randomUUID().toString();
		ratingEntity.setRatingId(string);
		RatingEntity save = ratingRepository.save(ratingEntity);
		return save;
	}

	@Override
	public List<RatingEntity> getRatings() {
		List<RatingEntity> findAll = ratingRepository.findAll();
		return findAll;
	}

	@Override
	public List<RatingEntity> getRatingByUserId(String userId) {
		List<RatingEntity> findByUserId = ratingRepository.findByUserId(userId);
		return findByUserId;
	}

	@Override
	public List<RatingEntity> getRatingByHotelId(String hotelId) {
		List<RatingEntity> findByHotelId = ratingRepository.findByHotelId(hotelId);
		return findByHotelId;
	}

}
