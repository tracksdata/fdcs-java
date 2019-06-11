package com;

import java.util.LinkedHashMap;

public class LInkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Object, Object> hm = new LinkedHashMap<>();

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
