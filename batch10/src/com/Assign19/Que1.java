package com.Assign19;

import java.util.Scanner;

//Design a method for counting the alphabet, vowels and numbers from String. Input should be from user into main method and pass that to methods. And result will print into main method 
public class Que1 {
	
	public static int Alphabet(String s) {
		int count =0;
		
		for(char ch : s.toCharArray()) {
			if(Character.isLetter(ch)) {
				count++;
			}
		}
		return count;
	}
	public static int Vowel(String s) {
		int count =0;
		
		String vowels = "AEIOUaeiou";
		for(char ch : s.toCharArray()) {
			if(vowels.indexOf(ch) != -1) {
				count++;
			}
		}
		return count;
	}
	public static int Number(String s) {
		int count =0;
		
		for(char ch : s.toCharArray()) {
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		Scanner S =new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = S.nextLine();
		S.close();
		
		int alphabet = Alphabet(input);
		int vowel = Vowel(input);
		int number = Number(input);
		
		System.out.println("Total Alphabet : " + alphabet);
		System.out.println("Total Vowel : " + vowel);
		System.out.println("Total Number : " + number);

	}

}
