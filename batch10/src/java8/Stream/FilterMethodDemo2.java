package java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodDemo2 {

	public static void main(String[] args) {

		List<String> cityList = Arrays.asList("Pune","Kolhapur","Mumbai","Nagpur","Goa","Patna","Akola");
		
		//Get the cities with chars more than 5..!!
		
//		Without Stream
		
//		List<String> list =new ArrayList<String>();
//		for(String s : cityList) {
//			if(s.length() > 5) {
//				list.add(s);
//			}
//			
//		}
//		System.out.println(list);
		
//		With Stream
		
//		List<String> filteredCityList = cityList.stream().filter(s ->s.length() > 5).collect(Collectors.toList());
//		System.out.println(filteredCityList);
		
//		cityList.stream().filter(s ->s.length() > 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		
//		List<String> filteredCityList= cityList.stream().filter(s->s.length() > 5).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(filteredCityList);
		
//		Get cities with chars 4 and 6
		
//		List<String> filterdBtwn = cityList.stream().filter(s->s.length() >= 4 && s.length() <=6).sorted().collect(Collectors.toList());
//		System.out.println(filterdBtwn);
		
		 cityList.stream().filter(s->s.length() >= 4 && s.length() <=6).sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
