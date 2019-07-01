package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.manytoone.Department;
import com.cts.employee.manytoone.Employee;


public class ManyToOne_Save {

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
		
		e1.setDept(dept1);
		e2.setDept(dept1);
		e3.setDept(dept1);
		e4.setDept(dept1);
		
		e5.setDept(dept2);
		e6.setDept(dept2);
		e7.setDept(dept2);
		e8.setDept(dept2);
		
		
		
		
		
		
		//dept2.getEmps().add(e1);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);

		ses.save(e5);
		ses.save(e6);
		ses.save(e7);
		ses.save(e8);


		ses.beginTransaction().commit();

		System.out.println(" --- Done ---");

	}

}
