package com;

public class DisplayUtilities {
	
	public static void displayEmployee(Employee emp) {
		
		System.out.println("Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		
		System.out.println("----------------------------------");
		
	}

}
