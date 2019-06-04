package com;

import java.io.FileInputStream;

class C1 {

}

public class Demo2 {

	static void f1() throws Exception {
		FileInputStream fis = new FileInputStream("src/abc.txt");
	}

	public static void main(String[] args) throws Exception {

		Demo2.f1();

		// Class.forName("com.C1");

		System.out.println("--- Done");

	}

}
