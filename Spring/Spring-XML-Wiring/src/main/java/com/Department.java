package com;

public class Department {

	public Department() {
		System.out.println("-- Dept class Object created");
	}

	private int deptId;
	private String deptName;

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

}
