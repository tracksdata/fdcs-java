package com;

public class SalariedEmployee extends Employee {

	private int noOfDaysWorked;

	@Override
	public void acceptData() {

		this.setEmpId(10);
		this.setEmpName("James");
		noOfDaysWorked = 22;

	}

	@Override
	public void processSalary() {
		this.setSalary(noOfDaysWorked * 1500);

	}

}
