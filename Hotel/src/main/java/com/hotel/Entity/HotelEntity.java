package com.hotel.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel_details")
public class HotelEntity {
	
	@Id
	@Column( name= " hotel_id")
	private String hotelId;
	
	@Column( name= " hotel_name")
	private String hotelName;
	
	@Column( name= " hotel_location")
	private String hotelLocation;
	
	private String about;
	
	

	public String getHotelId() {
		return hotelId;
	}



	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}



	public String getHotelName() {
		return hotelName;
	}



	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}



	public String getHotelLocation() {
		return hotelLocation;
	}



	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}



	@Override
	public String toString() {
		return "HotelEntity [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", about=" + about + "]";
	}
	
	


}
