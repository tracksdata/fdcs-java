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

		Employee e1 = new Employee(10, "Praveen", 8347455);
		Employee e2 = new Employee(11, "Bucky", 3463743);
		Employee e3 = new Employee(12, "James", 97549);
		Employee e4 = new Employee(13, "Richards", 4856845);
		Employee e5 = new Employee(14, "John", 598696);
		Employee e6 = new Employee(15, "Pallavi", 34838);
		Employee e7 = new Employee(16, "Ritam", 957979);
		Employee e8 = new Employee(17, "Maria", 9759759);

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
