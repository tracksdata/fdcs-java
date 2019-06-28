package com.cts.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "emp_test")
//@SecondaryTable(name = "dept")
@SecondaryTables(value = { @SecondaryTable(name = "dept"), @SecondaryTable(name = "project") })
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name", length = 30)
	private String empName;
	private double salary;

	@Column(name = "dept_id", table = "dept")
	private int deptId;
	@Column(name = "dept_name", length = 30, table = "dept")
	private String deptName;
	@Column(name = "dept_loc", length = 30, table = "dept")
	private String loc;

	@Column(name = "prod_id", table = "project")
	private int projId;
	@Column(name = "project_name", table = "project")

	private String projName;

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
