package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

/*
 * 
 * 	Fetching
 * 	----------
 * 	1. Single Row
 * 			-> get
 * 			-> load
 * 	2. Multi Row
 * 		-> HQL
 * 		-> Criteria API
 * 		-> Native SQL
 * 
 *  
 *    Fetching Techniques
 *    --------------------
 *    1. eager fetch
 *    		-> get method
 *    2. lazy fetch
 *    		-> load method
 *    
 * 
 */
public class FetchDemo {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = ses.get(Employee.class, 2);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		

		System.out.println("--- Done ---");
	}

}
