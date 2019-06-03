package com;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		
		StringBuffer sb1=new StringBuffer("Abc");
		System.out.println("sb1: "+sb1);
		System.out.println("sb1 Identity Hashcode: "+System.identityHashCode(sb1));
		
		//sb1.append(" Xyz");
		
		System.out.println("---------------------");
		System.out.println("sb1: "+sb1);
		System.out.println("sb1 Identity Hashcode: "+System.identityHashCode(sb1));
		
		sb1.insert(0, "Hello ");
		
		System.out.println("---------------------");
		System.out.println("sb1: "+sb1);
		System.out.println("sb1 Identity Hashcode: "+System.identityHashCode(sb1));
		
		StringBuffer sb2=new StringBuffer("Abc");
		
		System.out.println("---------------------");
		System.out.println("sb2: "+sb2);
		System.out.println("sb2 Identity Hashcode: "+System.identityHashCode(sb2));
		
		StringBuffer sb3=sb2.reverse();
		StringBuilder dd=new StringBuilder();
		
		sb2.append(" Praveen");
		
		System.out.println("---------------------");
		System.out.println("sb2: "+sb2);
		System.out.println("sb2 Identity Hashcode: "+System.identityHashCode(sb2));
		
		System.out.println("---------------------");
		System.out.println("sb3: "+sb3);
		System.out.println("sb3 Identity Hashcode: "+System.identityHashCode(sb3));
		
		
		

	}

}
