package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class Test2 {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Pravee");
		emp.setSalary(3487343);

		emp.setDeptId(1024);
		emp.setDeptName("HR");
		emp.setLoc("Delhi");
		
		emp.setProjId(1);
		emp.setProjName("Ford");

		ses.save(emp);
		ses.beginTransaction().commit();

		System.out.println(" --- Done ---");

	}

}
