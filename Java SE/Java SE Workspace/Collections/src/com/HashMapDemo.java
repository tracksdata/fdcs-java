package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Object, Object> hm = new HashMap<>();

		hm.put(1024, "Praveen");
		hm.put(1027, null);
		hm.put(1030, "Praveen");
		hm.put(1030, "Kim");
		hm.put(null, "Bucky");
		hm.put("player", "Roe");

		System.out.println(hm);

		System.out.println(hm.get(1024));

		// Properties file

	}

}
