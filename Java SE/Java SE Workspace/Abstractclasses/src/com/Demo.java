package com;

abstract class C1 {

	public void f1() {

	}

	public abstract void f2(); // soecification

}

public class Demo extends C1 {
	
	void f3() {
		
	}

	@Override
	public void f2() { // implermentation
		System.out.println("-- demo class f2 method");

	}

	public static void main(String[] args) {
		
		C1 c=new Demo();
		c.f2();
		c.f1();
		//c.
		
		//C1 c2=new C1();
		

	}

}
