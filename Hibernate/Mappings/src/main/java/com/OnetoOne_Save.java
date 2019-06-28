package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.onetoone.Department;
import com.cts.employee.onetoone.Employee;

public class OnetoOne_Save {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = new Employee();
		emp.setEmpId(12);
		emp.setEmpName("Ozvitha");
		emp.setSalary(38463);

		Department dept = new Department();
		dept.setDeptId(1111);
		dept.setDeptName("Training");
		dept.setLoc("Chennai");

		emp.setDept(dept);

		ses.save(emp);
		ses.beginTransaction().commit();

		System.out.println(" --- Done ---");

	}

}
