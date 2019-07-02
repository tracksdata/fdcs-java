package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class MultiColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Query<Object[]> q1 = ses.createQuery("select empId, empName,salary from Employee");
		
		
		List<Object[]> rows=q1.list();
		
		
		for(Object columns[]:rows) {
			
			 for(Object column:columns) {
				 System.out.println(column);
			 }
			 
			 System.out.println("-------------------");
			
		}
		
		
		
		

	

	}

}
