package com;

public class Rectangle extends Shape {

	@Override
	public void draw() {

		System.out.println("--- Dawing Rectangle");
		super.draw();
		super.x = 100;

	}

	
	void f1() {
		System.out.println("--- f1 method");
	}

	void f2() {
		System.out.println("-- f2 method");
	}

}
