package com.Assign5;

import java.util.Scanner;

public class Que1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int a = sc.nextInt();	
	
	  if (a > 0) {
          System.out.println("positive number.");
      } else if (a < 0) {
          System.out.println("negative number.");
      } else {
          System.out.println("The number is zero.");
      }
	

}
}
