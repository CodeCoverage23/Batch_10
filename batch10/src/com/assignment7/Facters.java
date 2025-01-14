package com.assignment7;
import java.util.Scanner;

public class Facters {
	public static void factorsValue(int num) {
        System.out.println("Factors of " + num + " are : ");
        
        // Loop  1 to num for find factors
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " , ");
            }
        }
    }
	
	public static void main(String[] args) {
        // Input from the user
        Scanner sc = new Scanner(System.in);

        // Value from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call the method
        factorsValue(num);
        sc.close();
    }

}
