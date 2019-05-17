package com;

public class Use implements Cloneable {

	public static void main(String[] args) {

		Product p1 = Product.getObject();
		Product p2 = Product.getObject();
		Product p3 = Product.getObject();

		p1.display();
		p2.display();
		p3.display();

		// Sample s=new Sample();

		// Product p1=new Product();
		// p1.display();

		// p2=new Product();
		// p2.display();

	}

}
