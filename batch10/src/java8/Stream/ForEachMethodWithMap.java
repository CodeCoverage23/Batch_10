package java8.Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ForEachMethodWithMap {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(1, "Tushar");
		m.put(2, "eeer");
		m.put(3, "cnccma");
		
		m.forEach((key,value)->System.out.println("Key: " + key + " Value: " + value));

	}

}
