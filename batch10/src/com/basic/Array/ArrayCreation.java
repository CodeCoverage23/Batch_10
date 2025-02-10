package com.basic.Array;

public class ArrayCreation {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
System.out.println(a);

for(int i = 0; i< a.length; i++) {
	System.out.println(a[i]);
}

int[] arr = {2,3,1,5,6,7,8,9};

for(int b : arr) {
	System.out.println(b);
}
	}

}
