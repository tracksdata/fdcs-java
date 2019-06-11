package com;

public class Test {

	void f1(int x) {
		System.out.println("Integer: " + x);
	}

	void f1(short x) {
		System.out.println("Short: " + x);
	}

	void f1(long x) {
		System.out.println("Long: " + x);
	}

	void f1(byte x) {
		System.out.println("Byte: " + x);
	}

	void f1(float x) {
		System.out.println("Float: " + x);
	}

	void f1(double x) {
		System.out.println("Double: " + x);
	}

	void f1(char x) {
		System.out.println("Character: " + x);
	}

	void f1(String x) {
		System.out.println("String: " + x);
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.f1(39473);

	}

}
