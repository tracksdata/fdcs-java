package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}

}

public class Test {

	public static void main(String[] args) {

		ArrayList<Employee> emps = new ArrayList<>();

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

		System.out.println("Original Collection");
		Employee.displayV1(emps);
		System.out.println("---------------------------");

		System.out.println("ON ID");

		Collections.sort(emps);

		Employee.display(emps);
		System.out.println("---------------------------");

		System.out.println("ON NAME");

		Collections.sort(emps, new Employee());

		Employee.display(emps);
		System.out.println("---------------------------");

		System.out.println("ON Salary");

		Collections.sort(emps, new SortBySalary());

		Employee.display(emps);
		System.out.println("---------------------------");

		Date d = new Date();
		System.out.println(d);
	}

}
