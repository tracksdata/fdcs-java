package com;

public class SalariedEmployee extends Employee {

	private int noOfDaysWorked;

	@Override
	public void acceptData() {

		setEmpId(10);
		setEmpName("James");
		noOfDaysWorked = 22;

	}

	@Override
	public void processSalary() {
	  setSalary(noOfDaysWorked * 1500);
	  
	  DisplayUtilities.displayEmployee(this);
	  

	}

}
