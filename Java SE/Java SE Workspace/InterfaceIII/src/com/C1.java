package com;

public class C1 implements MyInter1,MyInter2{

	@Override
	public void f1() {
		
		System.out.println(MyInter1.MAX_AGE);
		
		System.out.println("--- f1 of C1 class");
		
	}
	
	

}
