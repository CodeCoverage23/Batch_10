package com.assignment;

public class Assignment1_1 {

	public static void main(String[] args) {
		//Write the java program to print first character of your name on console.
		String str ="Vaishnavi";
		
				char[] ch= new char[str.length()];
				for(int i=0; i<=str.length()-1; i++) {
					
					System.out.print(str.charAt(i));
				}

	}

}
