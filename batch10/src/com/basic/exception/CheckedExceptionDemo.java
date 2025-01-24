package com.basic.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Checked exception is known as Compile time exception
 */
public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader file = new FileReader("C/test/test.txt");

	}

	public void myMethod() throws IOException {

		throw new IOException();

	}

}
