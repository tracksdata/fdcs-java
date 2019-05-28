package com;

public class Employee {

	private int empId;
	private String empName;

	public Employee() {
		System.out.println("--- Default Constrructor");
	}

	public Employee(int empId) {
		System.out.println("-- Argument constructor");
		this.empId = empId;
	}

	void display() {
		System.out.println(empId);
	}

	public static void main(String[] args) {

		
		
		
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(65);
		
		e1.display();
		e2.display();

	}

}
