package com.shiv.arrays;

public class ShiftElements {

	public static void main(String[] args) {

		int [] arr = {3,4,5,1,2}; //---> right
		                         // <--- left
		            //0,1,2,3,4
		
		/*int shiftBit=2;
		int first;
		TargetSum t = new TargetSum();
		int s[]=t.twoSum(arr, 9);
		
		for(int n:s){
			System.out.print(n);
		}*/
		
		System.out.println("before");
		for(int n:arr){
			System.out.print(n);
		}
		
		/*for(int k =0;k<shiftBit;k++){ 
			int j;
			first = arr[0];  //1
			for(j =0;j<arr.length-1;j++){
				
				arr[j] = arr[j+1];// 2,3,4,5,0
			}
			arr[j] = first; //2,3,4,5,1
		}*/
		
		System.out.println("after");
		for(int n:arr){
			System.out.print(n);
		}

	}

}
