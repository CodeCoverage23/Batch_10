package com.Assign9;

public class Count {
static int count =0;
public  Count() {
	count++;
}

public static void main(String[] args) {
	Count c1 = new Count();
	Count c2 = new Count();
	Count c3 = new Count();
	System.out.println("No. of Object : " + count);
}
}
