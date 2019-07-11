package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 = ac.getBean("myEmp", Employee.class);
		Employee e2 = ac.getBean("myEmp", Employee.class);

		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());

		System.out.println("------------------");

		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpName());
		System.out.println(e2.getSalary());
		
		ac.registerShutdownHook();
		ac.close();

	}

}
