package com.bill;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P003", "P004" };
		
		PriceMatrix price=new PriceMatrixImpl(); // Dependency class object
		
		//------------------------------------------
		BillingImpl biller = new BillingImpl(); // Dependent class
		biller.setPrice(price);  // DI -> Injecting Dependency object to the dependent class
		
		double total = biller.getCartPrice(cart1);
		//------------------------------------------

		System.out.println("Cart1 Total: " + total);
		
		total = biller.getCartPrice(cart2);
	

		System.out.println("Cart2 Total: " + total);


	}

}
