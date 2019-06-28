package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.onetoone.Department;
import com.cts.employee.onetoone.Employee;

public class OnetoOne_Fetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

	
		Employee emp=ses.get(Employee.class, 10);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());
		System.out.println(emp.getDept().getLoc());
		System.out.println("-----------");
		
		
		
		
		
		
	}

}
