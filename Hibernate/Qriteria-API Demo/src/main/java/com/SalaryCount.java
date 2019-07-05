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

public class SalaryCount {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);

		Root<Employee> root = criteriaQuery.from(Employee.class);

		criteriaQuery.select(criteriaBuilder.sum(root.get("salary")));

		Query<Double> qry = ses.createQuery(criteriaQuery);

		double totalSalary = qry.getSingleResult();

		System.out.println("Count: " + totalSalary);
		
		

	}
}
