package com.shiv.arrays;

import java.util.Arrays;
import java.util.List;


public class arrayCopyElement {

	public static void main(String args[]) {
		int [] arr1 = new int[]{1,2,3,4,5};
		
		List l=Arrays.asList(arr1);
		
		l.toArray();
		
		int [] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length;i++ ){
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr1.length;i++ ){
			System.out.print("1st array-"+arr1[i] +" ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length;i++ ){
			System.out.print("2nd array-"+arr2[i] +" ");
		}
	}
}
