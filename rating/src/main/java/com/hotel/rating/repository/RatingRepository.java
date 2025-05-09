package com.hotel.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.rating.entity.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, String>{
	List<RatingEntity> findByUserId(String userId);
	
	List<RatingEntity> findByHotelId(String hotelId);
}
