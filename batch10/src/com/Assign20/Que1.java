package com.Assign20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Write program to add the five students mobile number into arraylist and iterate that elements using iterator. 
public class Que1 {

	public static void main(String[] args) {
		
		ArrayList<String> mobileNumbers = new ArrayList<String>();
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Five Student MobileNumber :");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Student " + i);
			String number = Sc.nextLine();
			mobileNumbers.add(number);
		}
		Sc.close();
		
		System.out.println("Stored Number :");
		Iterator<String> iterator = mobileNumbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
