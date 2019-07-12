package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 = ac.getBean("emp1", Employee.class);
		// Department dept = ac.getBean(Department.class);
		// e1.setDept(dept);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());

		System.out.println(e1.getDept().getDeptId());
		System.out.println(e1.getDept().getDeptName());
		System.out.println("-------------------------");
		ac.close();

	}

}
