package com;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Object, Object> hm = new TreeMap<>();

		hm.put(1024, "Praveen");
		hm.put(1027, null);
		hm.put(1030, "Praveen");
		hm.put(1030, "Kim");
		hm.put(875, "Bucky");
		hm.put(53, "Roe");

		System.out.println(hm);

	//	System.out.println(hm.get(1024));

		// Properties file

	}

}
