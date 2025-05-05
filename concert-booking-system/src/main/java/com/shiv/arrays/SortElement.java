package com.shiv.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortElement {
public static void main(String args[]) {
	
	int []arr = {5,2,4,1,8,4};
	int temp = 0;
	
	
	//java 8
	
	Arrays.stream(arr).sorted().forEach(i->System.out.print(i));
	arr = Arrays.stream(arr).sorted().toArray();
	
	System.out.println(arr);
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
	System.out.println("SortedElements Are ");
	
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){ //for decending change to <
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
}
}
