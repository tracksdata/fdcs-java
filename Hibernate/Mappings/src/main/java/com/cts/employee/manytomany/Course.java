package com.cts.employee.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, double courseFee) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	@Id
	private int courseId;
	private String courseName;
	private double courseFee;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_info",joinColumns= {@JoinColumn(name="courseId")},inverseJoinColumns= {@JoinColumn(name="studentId")})
	private List<Student> students = new ArrayList<Student>();

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

}
