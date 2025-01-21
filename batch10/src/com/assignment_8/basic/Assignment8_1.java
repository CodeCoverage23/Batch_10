package com.assignment_8.basic;
/*1.1 Design the Student class which contain
firstName, lastName, city and mobileNumber and  country.
*/

public class Assignment8_1 {
	private String firstName;

	private String lastName;

	private String city;

	private String country;

	private String mobileNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Assignment8_1() {
		super();
		
	}

	public Assignment8_1(String firstName, String lastName, String city, String country, String mobileNummber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.country = country;
		this.mobileNumber = mobileNummber;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", country=" + country
				+ ", mobileNumber=" + mobileNumber + "]";
	}

			


}
