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

public class SingleColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery(Object.class);

		Root<Employee> root = criteriaQuery.from(Employee.class);

		criteriaQuery.select(root.get("empName"));

		Query<Object> qry = ses.createQuery(criteriaQuery);
		
		for(Object data:qry.getResultList()) {
			System.out.println(data);
		}
		
		

		
	}
}
