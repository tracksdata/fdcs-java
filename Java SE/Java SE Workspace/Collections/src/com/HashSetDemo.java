package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();

		hs.add("Praveen");
		hs.add(38438);
		hs.add('A');
		hs.add(7457.45f);
		hs.add("Praveen");

		System.out.println(hs);

		boolean f = hs.contains("Praveen123");
		System.out.println(f);
		
		System.out.println(hs.size());
		hs.remove('A');
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		ArrayList<Object> ar=new ArrayList<Object>(hs);
		
		
		System.out.println(ar);
		ar.set(0, "SOmetbing");
		
		System.out.println(ar);
		
		
		ArrayList<Object> ar1=new ArrayList<Object>();
		ar1.add("James");
		ar1.add("KIms");
		ar1.add("Praveen");
		ar1.add("James");
		ar1.add("Kavya");
		
		System.out.println(ar1);
		
		HashSet<Object> hs1=new HashSet<Object>(ar1);
		
		System.out.println(hs1);
		
		System.out.println("------------------");
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		System.out.println("---------------");
		
		Iterator<Object> it=hs.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}

	}

}
