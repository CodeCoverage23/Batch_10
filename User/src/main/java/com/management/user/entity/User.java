package com.management.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import  jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name="user_detail")
@Data
public class User {
     @Id
     @Column(name="ID")
     private String Id;
     
     @Column(name="NAME")
	private String name;
     
     @Column(name="EMAIL")
	private String email;
     
     @Column(name="ABOUT")
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
	
	
}
