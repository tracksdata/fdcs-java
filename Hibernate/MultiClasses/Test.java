package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session ses=sf.openSession();
		
		
		MultiIdentifierLoadAccess<Employee> multi=ses.byMultipleIds(Employee.class);
		
		List<Employee> emps= multi.multiLoad(10,12,13);
		
		System.out.println(emps.size());
		
	/*	for(Employee emp:emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-------------------------");
		}
		*/
		
		emps.forEach((emp)->{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-------------------------");
		});
		
		
		
		
		
		System.out.println(" --- Done ---");
		
		
		
		

	}

}
