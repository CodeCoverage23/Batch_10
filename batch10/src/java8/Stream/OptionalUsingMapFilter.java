package java8.Stream;

import java.util.Optional;

public class OptionalUsingMapFilter {

	public static void main(String[] args) {
		
		Optional<String> opName = Optional.of("Java Programming..!!");
		
		Optional<Integer> nameLength = opName.map(String::length);
		System.out.println("Length: " + nameLength.orElse(0));
		
		
		
		opName.filter(name -> name.startsWith("Java")).ifPresent(name -> System.out.println("Valid Name: " + name));
		
	}

}
