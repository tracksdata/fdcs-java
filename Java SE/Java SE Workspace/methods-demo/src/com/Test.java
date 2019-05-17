package com;

class Test {
	
	static Test t = new Test();


	void f1() {
		
		f3();
		f2();
		System.out.println("--- F1 method");
	}

	void f3() {
		System.out.println("-- F3 method");
	}

	static void f2() {
		Test t = new Test();
		t.f3();
		System.out.println("--- static f2 method");
	}

	public static void main(String[] args) {

	
		Test t = new Test();
		t.f1();
		// t.f2();

		f2();

	}

}
