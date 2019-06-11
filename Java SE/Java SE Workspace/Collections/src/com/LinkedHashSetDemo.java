package com;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> hs = new LinkedHashSet<>();

		hs.add("Praveen");
		hs.add(38438);
		hs.add('A');
		hs.add(7457.45f);
		hs.add("Praveen");

		System.out.println(hs);
		
		

	
	}

}
