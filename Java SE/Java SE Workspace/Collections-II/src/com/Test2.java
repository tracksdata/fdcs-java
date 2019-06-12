package com;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {

		HashSet<Employee> emps = new HashSet<>();

		Employee e1 = new Employee(89, "Jgf", 25000);
		Employee e2 = new Employee(11, "Sda", 15000);
		Employee e3 = new Employee(22, "Abc", 19000);
		Employee e4 = new Employee(32, "Dhg", 10000);
		Employee e5 = new Employee(10, "Mtg", 13000);

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		// display employee data from collection
		/*
		 * for (Employee emp : emps) { System.out.println(emp.getEmpId());
		 * System.out.println(emp.getEmpName()); System.out.println(emp.getSalary());
		 * System.out.println("-------------------------"); }
		 */

		Employee.displaySet(emps);

	}

}
