package com.assign5;
import java.util.Scanner;
public class GreaterThan100 {


    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 100) {
            System.out.println(number + " is greater than 100.");
        } else {
            System.out.println(number + " is not greater than 100.");
        }

        scanner.close();
    }
}

