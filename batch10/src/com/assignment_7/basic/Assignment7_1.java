package com.assignment_7.basic;

import java.util.Scanner;

/*1. Design method to check whether the character is alphabet, 
 * digit and special symbol.
 * 
 */
public class Assignment7_1 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		checkCharacterType(ch); 
		} 
	public static void checkCharacterType(char ch) {
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) { 
				System.out.println(ch + " is an alphabet."); 
				} else if (ch >= '0' && ch <= '9') { 
					System.out.println(ch + " is a digit."); 
					}
				else {
					System.out.println(ch + " is a special symbol."); 
					} 
			}

}
