package com.basic.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws FileNotFoundException{
FileReader f = new FileReader("c/test.txt");
	}
	public void myMethod() throws IOException{
		throw new IOException();
	}

}
