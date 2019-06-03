package com;

/*
 * Types of Objects
 * ----------------
 * 1. Immutable Objects(Content of object can not be modified on same hash code)
 * 		Ex: String and all wrapper classes
 * 2. Mutable (Content of an object can be modified on the same hash code)
 * 		Ex: StringBuffer
 * 
 * 
 *    String class
 *    -------------
 *    -> String class is a final class
 *    -> This class does not contains methods which modified the object directly
 */

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Abc";
		System.out.println("S1: " + s1);
		System.out.println("S1 Identity Hashcode: " + System.identityHashCode(s1));

		System.out.println("-----------------");
		String s2 = new String("Abc");
		System.out.println("S2: " + s2);
		System.out.println("S2 Identity Hashcode: " + System.identityHashCode(s2));
		
		//s2="Abc";
		
		System.out.println("-----------------");
		
		System.out.println("S2: " + s2);
		System.out.println("S2 Identity Hashcode: " + System.identityHashCode(s2));

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equals");
		}

	}

}
