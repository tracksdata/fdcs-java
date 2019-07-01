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

public class ManyToMany_Fetch {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session ses = sf.openSession();

		Course course = ses.get(Course.class, 102);

		System.out.println("Course Id: " + course.getCourseId());
		System.out.println("Name: " + course.getCourseName());

		course.getStudents().forEach(student -> {
		//	fee = fee + course.getCourseFee();
			System.out.println("Id: " + student.getStudentId());
			System.out.println("Name: " + student.getStudentName());
			System.out.println("--------------------------------------");
		}
		);

		

	}

}
