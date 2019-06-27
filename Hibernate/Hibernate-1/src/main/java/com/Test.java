package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session ses=sf.openSession();
		
		Employee emp=new Employee();
		emp.setEmpId(12);
		emp.setEmpName("Vijay");
		emp.setSalary(348639);
		
		Department dept=new Department();
		dept.setDeptId(1000);
		dept.setDeptName("IT");
		dept.setLoc("Kolkata");
		
		ses.save(emp);
		ses.save(dept);
		ses.beginTransaction().commit();
		
		System.out.println(" --- Done ---");
		
		
		
		

	}

}
