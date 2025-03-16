package com.Assign16;

import java.util.Scanner;

public class MainTest{
	public static void main(String[] args) {
		Product product = new Product();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Product weight>>");
		int productWeight = Sc.nextInt();
		
		try {
			product.productCheck(productWeight);
			
		} catch (ProductException e) {
			System.out.println(e);
		}
	}
}