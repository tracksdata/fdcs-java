package com;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<Object, Object> hm = new Hashtable<>();

		hm.put(1024, "Praveen");
		hm.put(1027, "dfmjhd");
		hm.put(1030, "Praveen");
		hm.put(1030, "Kim");
		hm.put(875, "Bucky");
		hm.put(6868, "jdhfd");

		System.out.println(hm);

		// System.out.println(hm.get(1024));

		// Properties file

	}

}
