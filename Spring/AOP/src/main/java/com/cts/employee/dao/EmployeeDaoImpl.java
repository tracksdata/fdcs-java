package com.cts.employee.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl {

	public void saveEmployee() {
		System.out.println("-- Save Employee");
	}
	
	public void findEmployee() {
		System.out.println("-- Find Employee ");
	}
	
	public void setEmployeeDepat(String deptName) {
		System.out.println("--- DAO: settingh up employee dept");
	}

}
