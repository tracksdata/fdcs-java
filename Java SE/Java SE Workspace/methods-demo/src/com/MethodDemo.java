package com;

/*
 *  method:
 *	--------
 *	-> A method is a special block which contains group of statements.
 *	-> A method can be invoked many times from any where
 *	-> Readability and re-usability
 *	-> mainly to maintain application
 *
 *   Rules
 *   -----
 *   1. Every method must have a return type
 *   2. If no return type id required, then return type must be void
 *   3. A method may or may not take argumnets.
 *   
 *   
 *   
 *   	Two Types argumants
 *   	----------------------
 *   	1. actual arguments
 *   	2. formal arguments
 *   
 *   Methods declarations
 *   ----------------------
 *   1. method declaration or calling method
 *   2. method defination or called method
 *   
 *   Scope of Data
 *   ---------------
 *   1. Call by Value : Every Primitive data types
 *   2. call by reference: Every object, and Arrays
 *   
 */

public class MethodDemo {
	
	 int age;

	 void f1(){ // difination // called method
		 
	 }
	 
	 void f2(int x) {// formal argument / dummy argumnet {
		 x=x+2000;
		 System.out.println("F2: X: "+x);
	 }
	 
	 int f4(int i) {
		 i=i+5000;
		 System.out.println("F4: i: "+i);
		 return i;
	 }
	 
	static void f3(MethodDemo md) {
		 md.age=90;
		 System.out.println("F3: Age: "+md.age);
	 }

	double square(double s) {
		return s*s;
	}
	public static void main(String[] args) {
		
		MethodDemo md=new MethodDemo();
		md.f1(); //  method declaration / calling method
		int x=1000;
		md.f2(x); // x is Actual argument
		System.out.println("Main: X: "+x);
		int i=2000;
		int res=md.f4(i);
		System.out.println("Main: I: "+i);
		System.out.println("Main res: "+res);
		md.age=40;
		f3(md);
		System.out.println(md.square(5.5));
		double r1=md.square(56.43);
		
		double r2=Math.pow(10,2);
		System.out.println("Result: "+r2);
		
		System.out.println("Main: Age: "+md.age);
		

	}

}
