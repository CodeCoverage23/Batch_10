package com.Assign17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//1. Write a Java Program for counting the vowels and numbers from file( abc.txt) .

public class Que1 {
	

	public static void main(String[] args) {
		String file = "C:\\Users\\TUSHAR\\CODE COVERAGE\\GIT\\Tushar Chavan\\Batch_10\\Batch_10\\batch10\\src\\com\\Assign17\\file";
		int vowelCount = 0;
		int digitCount = 0;
		try (BufferedReader br=new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null) {
				line.toLowerCase();
				
				for(char ch : line.toCharArray()) {
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
						vowelCount++;
					}
					else if(Character.isDigit(ch)) {
						digitCount++;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of Vowel : "+vowelCount);
		System.out.println("Number of Digit : "+digitCount);

	}

}
