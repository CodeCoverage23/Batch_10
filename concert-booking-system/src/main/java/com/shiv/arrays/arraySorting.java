package com.shiv.arrays;

public class arraySorting {

	public static void main(String args[]) {
		int arr[] = {5,9,2,6,8,6};
		int temp=0;
		System.out.println("Original Array");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		
		
		for(int i = 0;i<arr.length;i++){
			
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("Sorted Array assendind");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("Sorted Array decending");
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
