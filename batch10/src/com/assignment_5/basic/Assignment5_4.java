package com.assignment_5.basic;
/*
 * 4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case
 */
public class Assignment5_4 {

	public static void main(String[] args) {
		int month=12;
		String monthString="";
		//Switch statement
		switch(month) {
		//Case statement within the switch block
		
		
		case 1:monthString="1: January";
		System.out.println(monthString);
		break;
		
		case 2:monthString="2: February";
		System.out.println(monthString);
		break;
		
		case 3:monthString="3: March";
		System.out.println(monthString);
		break;
		
		case 4:monthString="4: April";
		System.out.println(monthString);
		break;
		
		case 5:monthString="5: May";
		System.out.println(monthString);
		break;
		
		case 6:monthString="6: June";
		System.out.println(monthString);
		break;
		
		case 7:monthString="7: July";
		System.out.println(monthString);
		break;
		
		case 8:monthString="8: August";
		System.out.println(monthString);
		break;
		
		case 9:monthString="9: September";
		System.out.println(monthString);
		break;
		
		case 10:monthString="10: Octomber";
		System.out.println(monthString);
		break;
		
		case 11:monthString="11: Septeber";
		System.out.println(monthString);
		break;
		
		case 12:monthString="12: December";
		System.out.println(monthString);
		break;
		default:
			System.out.println("Invalid Month");
		}

	
	}



	

}
