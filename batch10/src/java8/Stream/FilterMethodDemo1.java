package java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4,5,6,7,8,9,10,15);
		
		//Without stream
		
//		for(Integer l : list) {
//			System.out.println(l);
//		}
		
		//With Stream
		
//		list.stream().forEach(l->System.out.println(l));
		
		//Get even Number list - withOut Stream
		
//		ArrayList<Integer> eveneNumberList = new ArrayList<Integer>();
//		
//		for( Integer i : list) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//Get even Number list - withOut Stream
		List<Integer> evanNumber = list.stream().filter(e -> e % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println(evanNumber);

//		list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(f->System.out.println(f));
		
//		list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(System.out::print);
		
		//Get the list sorted..
		
		 evanNumber = evanNumber.stream().sorted().toList();
		System.out.println(evanNumber);
		
		
		
		
		
		
		
		
		
		
		
	}

}
