package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test2 {

	public static void main(String[] args) {
		
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session ses=sf.openSession();
		
		
	
		
		
		
		
		
		
		
		System.out.println(" --- Done ---");
		
		
		
		

	}

}
