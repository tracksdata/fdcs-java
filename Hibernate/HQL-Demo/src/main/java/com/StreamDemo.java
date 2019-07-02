package com;

import java.util.List;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class StreamDemo {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Stream<Employee> emps= ses.createQuery("from Employee").getResultList().stream();
		
	
	emps.forEach(emp->{
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println("-----------------------");
	});
	 
		
		

	

	

	}

}
