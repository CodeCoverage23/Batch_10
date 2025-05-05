package com.shiv.arrays;

public class LargestElement {
	public static void main(String args[]) {
		int arr[] = new int[] { 50, 40, 72, 15, 20, 70 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print("largest element in array " + max);
	}
}
