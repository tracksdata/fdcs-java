package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class SingleColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Query<Object> q1 = ses.createQuery("select e.empName from Employee as e");

		List<Object> names = q1.list();

		for (Object empName : names) {

			System.out.println(empName);

			System.out.println("-----------------------");
		}

	}

}
