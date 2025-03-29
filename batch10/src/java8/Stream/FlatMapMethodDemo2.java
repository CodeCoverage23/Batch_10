package java8.Stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapMethodDemo2 {

	public static void main(String[] args) {

		List<String> teamA = Arrays.asList("Tushar","Kant","Krishna");
		List<String> teamB = Arrays.asList("Nayan","Deep","Rohit");
		List<String> teamC = Arrays.asList("Ken","Sam","Tejas");
		
		List<List<String>> cricketPlayer = Arrays.asList(teamA,teamB,teamC);
		
		//without Stream....!!
		
		for(List<String> list : cricketPlayer) {
			for(String s : list) {
				System.out.println(s);
			}
		}
		
		//with Stream....!!
		
		cricketPlayer.stream().flatMap(m->m.stream()).toList().stream().filter(e->e.length()>4).map(m->m.toUpperCase()).forEach(System.out::println);
		
	}

}
