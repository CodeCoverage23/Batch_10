package com.shiv.arrays;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };
		int target = 18;
		// output-1,2
		int [] result =twoSum(arr,target);
		
		for(int n:result){
			System.out.print(n);
		}

	}

	public static int[] twoSum(int [] arr, int target) {
		
				/*int a[]=new int[2];
						for (int i = 0; i < arr.length; i++) {

							for (int j = i + 1; j < arr.length; j++) {
								if (arr[i] + arr[j] == target) {
									//System.out.println(i + "," + j);
									a[0]=i;
									a[1]=j;
									return a;
								}

							}

						}
						return a;*/
		
		Map map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++){  //2, 7, 11, 15 
			if(map.containsKey(arr[i])){ //2
				int j = (int) map.get(arr[i]);
				return new int[]{j,i};
			}
			map.put(target-arr[i], i);
			        //  16,0
			        // 11,1
			      
	}
	
	return arr;	
	}

}
