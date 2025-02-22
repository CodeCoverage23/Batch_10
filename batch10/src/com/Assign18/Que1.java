package com.Assign18;


//1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. You need to provide optimum solution to find the missing number. Number can not be repeated in the array.
public class Que1 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,7,8,9};
		
		int l = a.length;
		
		for(int i=1; i<=l;i++) {
			int count=0;
			
		 for(int j = 0;j<l;j++) {
			 if(i==a[j]) {
				 count++;
			 }
		 }
		 
		 if(count==0) {
			 System.out.println("Missing number : " + i);
		 }
		}

	}

}
