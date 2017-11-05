package com.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTry {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("first", 1);
		map.get("first");
		Set<Entry<String, Integer>> a = map.entrySet();

		for (Entry<String, Integer> b : a) {

		}

	}
}
