package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.onetomany.Department;
import com.cts.employee.onetomany.Employee;

public class OnetoMany_Save {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee e1 = new Employee(10, "Praveen", 10000);
		Employee e2 = new Employee(11, "Bucky", 5000);
		Employee e3 = new Employee(12, "James", 12000);
		Employee e4 = new Employee(13, "Richards", 150000);
		Employee e5 = new Employee(14, "John", 13000);
		Employee e6 = new Employee(15, "Pallavi", 2000);
		Employee e7 = new Employee(16, "Ritam", 7500);
		Employee e8 = new Employee(17, "Maria", 14000);

		Department dept1 = new Department();
		dept1.setDeptId(1);
		dept1.setDeptName("HR");
		dept1.setLoc("Kolkata");
		
		Department dept2 = new Department();
		dept2.setDeptId(2);
		dept2.setDeptName("Accounts");
		dept2.setLoc("Chennai");

		dept1.getEmps().add(e1);
		dept1.getEmps().add(e2);
		dept1.getEmps().add(e3);
		dept1.getEmps().add(e4);
		
		dept2.getEmps().add(e5);
		dept2.getEmps().add(e6);
		dept2.getEmps().add(e7);
		dept2.getEmps().add(e8);
		
		
		//dept2.getEmps().add(e1);

		ses.save(dept1);
		ses.save(dept2);

		ses.beginTransaction().commit();

		System.out.println(" --- Done ---");

	}

}
