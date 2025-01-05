package com.Assign7;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		char i = sc.next().charAt(0);
		
		if((i >= 'a' && i<='z') || (i >= 'A' && i<='Z')){
			System.out.println("Alphabet");
		}
		else if(i >= '0' && i<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Symbol");
		}
		

	}

}
