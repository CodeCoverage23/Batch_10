package com.Assign6;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        
        long fact = 1;
        

        for (int i = 1; i <= number; i++) {
            fact *= i; 
        }
        
  
        System.out.println(fact);
        
     
    }

}
