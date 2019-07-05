package com;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

		Root<Employee> root = criteriaQuery.from(Employee.class);

		criteriaQuery.select(root);

		Query<Employee> qry = ses.createQuery(criteriaQuery);

		qry.getResultList().forEach(emp -> {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("--------------------");
		});

	}
}
