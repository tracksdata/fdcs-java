package com.bill;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent class

/*
 * 	Design Issues
 * ----------------
 * 	-> Too many dependency object creations
 * 		-> memory issues
 * 		-> perf goes down
 * 	Why this issue happened?
 * ----------------------------
 * 		-> Dependent class is creating dependency class object
 * 
 * What is the Solution?
 * ----------------------------
 * 		-> Do not create dependency object in the dependent class
 * 			How can I get Dependency object?
 *		-----------------------------------------
 * 				-> JNDI
 * 				-> Don't look up or create. Insted Ask some one to inject the dependency object (IOC)
 * 				-> Injecting dependency object to the dependent is called Dependency Injection(DI)
 *     
 *     DI
 *     -----
 *     	1. By creating setter based injection
 *     	2. By creating constructor based injection
 *     
 * 	
 */

public class BillingImpl {

	private PriceMatrix price;

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}

	public double getCartPrice(String[] cart) {

		double total = 0.0;

		// PriceMatrix price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);

		}

		return total;

	}

}
