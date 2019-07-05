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

public class MultiColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

		Root<Employee> root = criteriaQuery.from(Employee.class);
		

		criteriaQuery.multiselect(root.get("empName"),root.get("salary"));

		Query<Object[]> rows = ses.createQuery(criteriaQuery);
		
		for(Object[] columns:rows.getResultList()) {
			
			  for(Object column:columns) {
				  System.out.println(column);
			  }
			  
			  System.out.println("-------------------");
			
		}
		
		

		
	}
}
