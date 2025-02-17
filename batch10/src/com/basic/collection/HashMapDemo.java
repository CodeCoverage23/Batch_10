package com.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		System.out.println(map + " " + map.isEmpty());

		map.put(11, "Pune");
		map.put(16, "Akola");
		map.put(17, "Mumbai");
		map.put(91, "Delhi");
		map.put(61, "Nagpur");
		map.put(51, "Wardha");
		map.put(15, null);
		map.put(11, "Patur");

		System.out.println(map);

		System.out.println(map.isEmpty());

		System.out.println(map.containsKey(50));
		System.out.println(map.containsKey(51));

		map.replace(15, "Manali");

		System.out.println(map);

		for (Map.Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
			System.out.println(m.getKey());
			System.out.println(m.getValue());

		}

	}

}
