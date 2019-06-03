package com;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = new String("Abc");
		String s2 = new String("Abc");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		System.out.println("-------------------");
		
		char value[] = s1.toCharArray();
		int h = 0;

		for (int i = 0; i < value.length; i++) {

			h = 31 * h + value[i];

		}
		
		System.out.println("My Own H Hash code: "+h);
		
		char ch='A';
		System.out.println((int)ch);
		

	}

}
