package com.Assign16;

/* Assignment 16
*
* 1. Design the Product class in which design
* void productCheck(int weight) in check
* whether weight is less than 100, then throw the ProductException
* with meaningful message.
2. Design the ProductException class in which write custom exceptions.
3. Create MainProduct class in which pass the input to productCheck
method with try and catch block.
*/

import java.util.Scanner;

public class Product {

	public void productCheck(int weight) {
		if(weight < 100) {
			throw new ProductException("Invalid Weight, Weight Must Be Above 100.");
			
		}
	}
}

