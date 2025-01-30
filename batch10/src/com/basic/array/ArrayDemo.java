package com.basic.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int a = 0;
		int[] arr = new int[11];
		for (int i = 1; i <= 10; i++) {
//			a = i * 2;
			arr[i] = i * 2;
		}

//		System.out.println(a);

		for (int b : arr) {
			System.out.println(b);
		}

	}

}
