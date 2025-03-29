package java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo2 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,5,8,2,4,9);
		System.err.println(l);
		
//		List<Integer> list = l.stream().sorted().collect(Collectors.toList());
//		System.out.println(list);
		
		//Get the list as a cube..!!
		
		l.stream().map(m->m*m*m).forEach(System.out::println);
		
		//Multiply by 5..!!
		l.stream().map(m->m*5).forEach(System.out::println);
	}

}
