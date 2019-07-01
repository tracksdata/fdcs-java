package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class UpdateTest {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Employee emp = ses.get(Employee.class, "ABC100156196267134345466");
		//emp.setEmpName("James");
		emp.setSalary(1010101);

		ses.update(emp);

		ses.beginTransaction().commit();

		System.out.println(" --- Done ---");

	}

}
