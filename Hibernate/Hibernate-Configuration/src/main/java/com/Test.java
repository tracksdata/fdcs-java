package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.config.HibernateUtil;
import com.cts.entity.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session ses = sf.openSession();
		
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(474744);

		ses.save(emp);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
