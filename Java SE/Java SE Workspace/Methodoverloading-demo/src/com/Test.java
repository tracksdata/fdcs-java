package com;

/*
 * 		Polymorohism
 * 	====================
 * 	-> Appearing in mary forms.
 * 		Two Types
 * 			1. Static polymorphism	: method overloading
 * 				-> static polymorphism, decission taken my compiler
 * 			2. Dynamic polymorphism: method overrriding
 * 				-> decission taken by JVM
 * 
 * 	Method Overloading
 * -----------------------
 * 	-> Defining the same method (with same name) with different signature
 * 	Signature
 * 	----------
 * 		-> number of arguments
 * 		-> type of arguments
 * 		-> position of arguments
 * 
 * 
 */



public class Test {
	
	void f1(int  x) {
		System.out.println("Int: "+x);
	}
	
	
	void f1(float x) {
		System.out.println("Float: "+x);
	}
	

	void f1(int x,int y) {
		System.out.println("Int: "+x);
	}
	

	void f1(float  x,float y) {
		System.out.println("Int: "+x);
	}

	void f1(int  x,float y) {
		System.out.println("Int: "+x);
	}
	
	void f1(float  x,int  y) {
		System.out.println("Int: "+x);
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		
		
		
		
	}

}
