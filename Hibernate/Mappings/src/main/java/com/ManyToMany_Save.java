package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.db.config.HibernateUtil;
import com.cts.employee.manytomany.Course;
import com.cts.employee.manytomany.Student;
import com.cts.employee.manytoone.Department;
import com.cts.employee.manytoone.Employee;

public class ManyToMany_Save {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Student s1 = new Student(10, "Praveen");
		Student s2 = new Student(11, "James");
		Student s3 = new Student(12, "Ruth");
		Student s4 = new Student(13, "Megha");

		Course java = new Course(101, "Java", 15000);
		Course js = new Course(102, "Java Script", 25000);
		Course spring = new Course(103, "Spring", 12000);
		Course hibernate = new Course(104, "Hibernate", 11000);

		java.getStudents().add(s1);
		java.getStudents().add(s2);
		java.getStudents().add(s3);
		java.getStudents().add(s4);

		js.getStudents().add(s2);
		js.getStudents().add(s4);

		spring.getStudents().add(s1);
		spring.getStudents().add(s3);
		spring.getStudents().add(s4);

		hibernate.getStudents().add(s2);

		ses.save(java);
		ses.save(js);
		ses.save(spring);
		ses.save(hibernate);

		ses.beginTransaction().commit();

		System.out.println(" --- Done ---");

	}

}
