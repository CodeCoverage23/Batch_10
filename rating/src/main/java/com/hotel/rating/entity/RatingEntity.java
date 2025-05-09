package com.hotel.rating.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "hotel_rating")
public class RatingEntity {
	@Id
	@Column(name = "Rating_Id")
	private String ratingId;
	@Column(name = "User_Id")
	private String userId;
	@Column(name = "Hotel_Id")
	private String hotelId;
	@Column(name = "Rating")
	private int rating;
	@Column(name = "Feedback")
	private String feedback;
}
