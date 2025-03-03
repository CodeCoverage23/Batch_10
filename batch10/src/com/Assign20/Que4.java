package com.Assign20;

import java.util.ArrayList;

//Suppose I have arraylist which contain elements as [mumbai, pune, Bangalore, Hyderabad, mumbai], now I want to remove the mumbai from list and print that data.
public class Que4 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Hydrabad");
		cities.add("Mumbai");
		
		cities.remove(0);
		System.out.println(cities);
		
	

	}

}
