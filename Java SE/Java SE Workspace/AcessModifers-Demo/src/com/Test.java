package com;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(38334343);

		emp1.setEmpId(11);
		emp1.setEmpName("Praveen");
		emp1.setSalary(27263);

		emp2.setEmpId(12);
		emp2.setEmpName("Ozvitha");
		emp2.setSalary(34839);

		// System.out.println(emp.getEmpId());
		// System.out.println(emp.getEmpName());
		// System.out.println((long)emp.getSalary());

		emp.display();

		emp1.display();
		emp2.display();

	}

}
