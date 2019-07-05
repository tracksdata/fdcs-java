package com;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class Test2 {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();
		String query="from Employee as e where e.empName like '%a%'";
		

	
		TypedQuery<Employee> q1 = ses.createQuery(query,Employee.class);
		
		List<Employee> emps = q1.getResultList();
		
		
			

		for (Employee emp : emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------------");
		}

	

	}

}
