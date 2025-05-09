package com.management.user.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.management.user.Exception.ResourceNotFoundException;
import com.management.user.entity.Hotel;
import com.management.user.entity.Rating;
import com.management.user.entity.User;
import com.management.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getUserById(String UserId) {
		// TODO Auto-generated method stub

		User user = userRepository.findById(UserId).orElseThrow(
				() -> new ResourceNotFoundException("user with gievn id is not found in server " + UserId));
		 Rating[] ratingOfUser = restTemplate.getForObject("http://localhost:8088/ratings/all/" + user.getId(),
				Rating[].class);

		 List<Rating> ratings = Arrays.stream(ratingOfUser).toList();
		 
		 ratings.stream().map(rating -> {
			ResponseEntity<Hotel> forEntity = restTemplate
					.getForEntity("http://localhost:8085/hotel/get/" + rating.getHotelId(), Hotel.class);

			Hotel hotel = forEntity.getBody();
			rating.setHotel(hotel);
			return rating;

		}).collect(Collectors.toList());

		user.setRatings(ratings);
		return user;
	}

}
