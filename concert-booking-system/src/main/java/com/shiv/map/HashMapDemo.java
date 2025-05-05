package com.shiv.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String args[]){
		
		int [] arr = {1,2,3,4,5};
		int[] res = reverseArray(arr);
		
		 for(int i=0;i<res.length;i++){
		  System.out.println(res[i]);
		 }
	}
	static int[] reverseArray(int[] a) {
        int []b=new int[a.length];
        int j = 0;
        for(int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }

    return b;
    }
}
