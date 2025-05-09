package com.management.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Transient;
import lombok.Data;

@Data
public class Rating {
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
	
	
	private Hotel hotel;
//	@Transient
//	private List<Hotel> hotel = new ArrayList<>();
}
