package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.onetomany.Department;
import com.cts.employee.onetomany.Employee;

public class OnetoMany_Fetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Department dept=ses.get(Department.class, 2);
		
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Dept name: "+dept.getDeptName());
		System.out.println("Location: "+dept.getLoc());
		
		dept.getEmps().forEach(emp->{
			System.out.println("Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("-----------------------------");
		});
		
		
		
		
		
		

	}

}
