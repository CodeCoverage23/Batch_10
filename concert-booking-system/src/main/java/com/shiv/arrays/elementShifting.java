package com.shiv.arrays;

public class elementShifting {

	public static void main(String args[]){
		int []arr = {1,2,3,4,5};
		int first;
		int n =2;
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
			
		}
		for(int k=0;k<n;k++){
			int j;
			first = arr[0];
			for(j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println("Array elements after shifting are");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
			
		}
		
	}

}
