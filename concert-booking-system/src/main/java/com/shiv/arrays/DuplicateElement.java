package com.shiv.arrays;

import java.sql.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElement {
	public static void main(String args[]){
		int []arr = {1,2,3,4,5,5,7,1};
		for(int i =0;i<arr.length;i++){
			for(int j =i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]+" ");
				}/*else{
					System.out.println(arr[j]+" ");
				}*/
			}
		}
		/*List<Integer> l = Arrays.asList(arr);
		Arrays.stream(arr).distinct().forEach(System::println);*/
		ArrayList<int []> a =removeDuplicate(arr);
		System.out.println(a);
	}
	public static ArrayList<int[]> removeDuplicate(int []arr1){
		
		ArrayList<int[]> al = new ArrayList<>(Arrays.asList(arr1));
		//List<int[]> l=Arrays.asList(arr1);
		for(int[] i:al){
			if(!al.contains(i)){
				al.add(i);
			}
			
		}
		
		return al;
		
	}


}

