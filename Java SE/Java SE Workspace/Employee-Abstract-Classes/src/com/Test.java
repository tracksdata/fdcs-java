package com;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new SalariedEmployee();
		
		emp.acceptData();
		emp.processSalary();
		emp.display();
		
		
		emp=new ContractEmployee();
		emp.acceptData();
		emp.processSalary();
		emp.display();

	}

}
