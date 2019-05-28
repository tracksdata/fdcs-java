package com;

public class ContractEmployee extends Employee {

	private int noOfHoursWorked;

	@Override
	public void acceptData() {

		this.setEmpId(1024);
		this.setEmpName("Praveen");
		noOfHoursWorked = 60;

	}

	@Override
	public void processSalary() {
		this.setSalary(noOfHoursWorked * 5000);

	}

	// @Override
	// public void processSalary() {
	// this.setSalary(noOfHoursWorked*5000);

	// }

}
