package java8.Stream;

import java.util.Arrays;
import java.util.List;

//Arbitrary Object

public class ReferenceToInstanceMethodDemo2 {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Tushar","Kant");
		names.forEach(System.out::println);

	}

}
