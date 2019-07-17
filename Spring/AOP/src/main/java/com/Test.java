package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.employee.config.AppConfig;
import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.model.Employee;
import com.cts.employee.model.Product;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = ac.getBean(Employee.class);
		Product prod = ac.getBean(Product.class);
		EmployeeDaoImpl dao = ac.getBean(EmployeeDaoImpl.class);

		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(3848);

		dao.setEmployeeDepat("IT");

		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(34684);

		System.out.println("--- Done ");

		ac.close();

	}

}
