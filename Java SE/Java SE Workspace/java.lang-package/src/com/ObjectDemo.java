package com;

import java.util.Scanner;

class C1 {

	public C1() {
		System.out.println("--- C1 class Object created");
	}

	public void f1() {
		System.out.println("-- f1 method of C1");
	}

}

class C2 {

	public C2() {
		System.out.println("--- C2 class Object created.");
	}

	public void f2() {
		System.out.println("-- f2 method of C2");
	}

}

public class ObjectDemo {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inout a class: ");
		String clsName = sc.next();

		Class cl = Class.forName(clsName);
		
		Object obj=cl.newInstance();
		
		
		if(obj instanceof C1) {
			C1 c1=(C1)obj;
			c1.f1();
		}
		if(obj instanceof C2) {
			C2 c2=(C2) obj;
			c2.f2();
		}
		
		
		
		

		//System.out.println(cl);

		System.out.println("--- Done --");

	}

}
