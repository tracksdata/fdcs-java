package com.pricematrix;

//Dependency class
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("--- PriceMatricxImpl object created");
	}

	
	@Override
	public double getItemPrice(String itemCode) {

		// Code to connect to DB and get price of a given item

		return 100.00;

	}

}
