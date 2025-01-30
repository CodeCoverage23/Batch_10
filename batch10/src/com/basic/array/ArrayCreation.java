package com.basic.array;

public class ArrayCreation {

	public static void main(String[] args) {

		// 1st Way

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println(a);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

		// 2nd Way

		int[] arr = { 2, 1, 3, 4, 6, 7, 8, 9, 6 };

		for (int b : arr) {
			System.out.println(b);
		}

	}

}
