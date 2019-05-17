package com;

public class Product{

	static Product prod = null;

	private Product() {
		System.out.println("---- Product Object Created..");
	}

	static Product getObject() {
		if (prod == null) {
			prod = new Product();
		}

		return prod;
	}

	void f1() {
		System.out.println("----- Hello");
	}

	void display() {
		System.out.println("--Information about products: " + this.hashCode());

	}

}
