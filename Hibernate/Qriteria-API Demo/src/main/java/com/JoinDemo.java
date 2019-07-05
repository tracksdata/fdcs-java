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

public class JoinDemo {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Department> criteriaQuery = criteriaBuilder.createQuery(Department.class);

		Root<Department> deptRoot = criteriaQuery.from(Department.class);

		criteriaQuery.select(deptRoot);
		Query<Department> depts = ses.createQuery(criteriaQuery);

		for (Department dept : depts.getResultList()) {
			System.out.println(dept.getDeptId());
			System.out.println(dept.getDeptName());

			for (Employee emp : dept.getEmps()) {
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
				System.out.println(emp.getSalary());
				System.out.println("-----------------------------");

			}

			System.out.println("=============================");

		}

		/*
		 * 
		 * criteriaQuery.where(criteriaBuilder.equal(deptRoot.get("deptId"),empRoot.get(
		 * "emps")));
		 * 
		 * Query<Object[]> rows = ses.createQuery(criteriaQuery);
		 * 
		 * for (Object[] columns : rows.getResultList()) {
		 * 
		 * for (Object column : columns) {
		 * 
		 * if (column instanceof Department) { Department dept = (Department) column;
		 * System.out.println(dept.getDeptId()); System.out.println(dept.getDeptName());
		 * }
		 * 
		 * if (column instanceof Employee) {
		 * 
		 * Employee emp = (Employee) column; System.out.println(emp.getEmpId());
		 * System.out.println(emp.getEmpName()); System.out.println(emp.getSalary());
		 * 
		 * }
		 * 
		 * } System.out.println("-----------------------");
		 * 
		 * }
		 * 
		 */

	}
}
