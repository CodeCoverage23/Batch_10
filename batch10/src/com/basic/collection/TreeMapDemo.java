package com.basic.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();

		map.put(41, "ABC");
		map.put(91, "ABC");
		map.put(31, "ABC");
		map.put(21, "ABC");
		map.put(71, "ABC");
		map.put(71, "DEF");

		System.out.println(map);

	}

}
