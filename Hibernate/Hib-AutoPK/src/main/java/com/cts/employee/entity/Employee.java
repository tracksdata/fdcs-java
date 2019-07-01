package com.cts.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "myKey", strategy = "com.cts.employee.entity.CutomKeyGen")
@DynamicUpdate
public class Employee {

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(generator = "myKey")
	private String empId;
	private String empName;
	private double salary;
	@Version
	private long versionNo;

	public long getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(long versionNo) {
		this.versionNo = versionNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
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

}
