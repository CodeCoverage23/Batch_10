package java8.Stream;

import java.util.Optional;

public class HandlingNullValuesUsingOptional {

	public static void main(String[] args) {
		
		String name = null;
		
		Optional<String> opName = Optional.ofNullable(name);
		
		
		
		String result = opName.orElse("Default Name");
		System.out.println(result);
		
		
		
		result = opName.orElseGet(() -> "Generated Name");
		System.out.println(result);

	}

}
