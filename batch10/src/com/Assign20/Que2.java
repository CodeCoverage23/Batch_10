package com.Assign20;

import java.util.ArrayList;
import java.util.Scanner;

//Design the generics arraylist for string and add five cities into it and iterate that using for each loop.
public class Que2 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter  Cities : ");
		for(int i=1;i<=5;i++) {
		String c = S.nextLine();
		cities.add(c);
	}
		for(String city : cities) {
			System.out.println(city);
		}

	}

}
