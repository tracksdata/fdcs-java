package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Employee;

public class Parameters {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();
		String query="from Employee as e where e.empId=:myid AND e.salary>=:sal";
		

		Query<Employee> q1 = ses.createQuery(query);
		//q1.setInteger(1,10);
		q1.setParameter("myid", 12);
		q1.setParameter("sal", 100.00);
		
		List<Employee> emps = q1.list();

		for (Employee emp : emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------------");
		}

	

	}

}
