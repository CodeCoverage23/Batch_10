package com.assignment7;
import java.util.Scanner;
public class Cub {
	public int getNumberCube(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner sc = new Scanner(System.in);

// message for user 

System.out.println("Enter a number");


int value = sc.nextInt();

Cub c = new Cub();

//create object for call method

int cube =  c.getNumberCube(value); 

// print the output

System.out.println("the cube of  " + value + "  is " +cube);

// close scanner
sc.close(); 
	}

}
