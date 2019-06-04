package com;

public class ThrowDemo {

	public static void main(String[] args) {

		int x = -100;

		try {

			if(x<0) {
				throw new Exception();
			}
			System.out.println(x);

		} catch (Exception e) {
			System.out.println("Do not provide negatiove numbers");
		}

	}

}
