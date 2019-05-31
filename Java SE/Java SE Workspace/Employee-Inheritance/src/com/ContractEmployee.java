package com;

public class ContractEmployee extends Employee {

	private int noOfHoursWorked;

	@Override
	public void acceptData() {

		setEmpId(1024);
	    setEmpName("Praveen");
		noOfHoursWorked = 60;

	}

	@Override
	public void processSalary() {
		setSalary(noOfHoursWorked * 5000);
		DisplayUtilities.displayEmployee(this);

	}

	// @Override
	// public void processSalary() {
	// this.setSalary(noOfHoursWorked*5000);

	// }

}
