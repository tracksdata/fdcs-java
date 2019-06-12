package com;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Set;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void display(List<Employee> emps) {
		System.out.println("Id\tName\tSalary");
		System.out.println("--------------------------");
		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getSalary());
			System.out.println();

		}

	}

	public static void displaySet(Set<Employee> emps) {
		System.out.println("Id\tName\tSalary");
		System.out.println("--------------------------");
		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getSalary());
			System.out.println();

		}

	}

	public static void displayMap(Set<Integer> keys, Map<Integer, Employee> emps) {
		System.out.println("Id\tName\tSalary");
		System.out.println("--------------------------");

		for (Integer key : keys) {
			System.out.print(emps.get(key).getEmpId() + "\t" + emps.get(key).getEmpName() + "\t" + emps.get(key).getSalary());
			System.out.println();

		}

	}

}
