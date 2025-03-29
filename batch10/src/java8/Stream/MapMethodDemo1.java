package java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapMethodDemo1 {

	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("Pune", "Nagpur", "Goa", "Mumbai");
		
		//Get the vehicles in uppercase...!!!!
		
		//Without Stream....!!!
		
//		for(String s : list) {System.out.println(s.toUpperCase());}
		
		//With Stream
		list.stream().map(m->m.toUpperCase()).forEach(System.out::println);

		//Get the length of a string...!!!!
		
		//With Stream..!!
		list.stream().map(m->m.length()).forEach(System.out::println);
		
		//Get the Strings which has chars less than or equal to 4 with uppercase....!!
		
		list.stream().filter(f->f.length()<=4).map(m->m.toUpperCase()).forEach(System.out::println);
		
		//Without Stream....!!!
		
		ArrayList<String> a =new ArrayList<String>();
		for(String s : list) {
			if(s.length()<=4) {
				a.add(s.toUpperCase());
			}
		}
		System.err.println(a);
}
}