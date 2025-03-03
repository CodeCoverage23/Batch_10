package com.practice;

import java.util.Arrays;
import java.util.List;

public class LuckyNumber {

	public static void main(String[] args) {
		List<String> StringList1= Arrays.asList( "", "ab124c", "11111", "123456", "001100", "801522", "919642", "9935777", "2589634");

		// take input from user ;  
		for (String value : StringList1) {

			if (IsLucky(value)) {
				System.out.println(value + " is lucky");
			} else {

				System.out.println(value + " is not lucky");
			}
		}
	}

	private static boolean IsLucky(String value) {
		if (value.length() < 6) {
			return false;
		}else {
			if(onlyDigits(value)) {
				return isSumOfTwoHalfEqual(value);
			}else {
				return false;
			}
		}	
	}
	
	public static boolean onlyDigits(String s) {
	      
        // Traverse each character in the string
        for (int i = 0; i < s.length(); i++) {
          
            // Check if the character is not a digit
            if (!Character.isDigit(s.charAt(i))) {
              
                // If any character is not a digit, return false
                return false; 
            }
        }
        return true;  // If all characters are digits, return true
    }
	
	public static boolean isSumOfTwoHalfEqual(String value) {
		int halfIndex = (value.length()) / 2;
		int secondStringIndex = value.length() % 2 == 0 ? halfIndex : halfIndex + 1; // change for odd length if 7 = 4+3
		String StringFirstHalf = value.substring(0, halfIndex);
		String StringSecondHalf = value.substring(secondStringIndex);

		int sum1 = 0, sum2 = 0;
		try {
			for (int i = 0; i < StringFirstHalf.length(); i++) {

				sum1 += Integer.parseInt(StringFirstHalf.substring(i, i + 1));
			}

			for (int i = 0; i < StringSecondHalf.length(); i++) {
				// sum2 += Int32.Parse(StringSecondHalf[i].ToString());
				sum2 += Integer.parseInt(StringSecondHalf.substring(i, i + 1));
			}
		} catch (Exception e) {
			return false;
		}

		return sum1 == sum2;
	}

	

}
