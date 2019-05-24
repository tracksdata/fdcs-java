package com;

public class HR {

	public static void main(String[] args) {
		
		Department d1=new Department();
		Department d2=new Department();
		
		d1.setDeptId(10);
		d1.setDeptName("IT");
		
		d2.setDeptId(11);
		d2.setDeptName("Accounts");
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setEmpId(1);
		e1.setEmpName("James");
		e1.setSalary(4384385);
		
		e2.setEmpId(2);
		e2.setEmpName("Bucky");
		e2.setSalary(467454);
		
		e1.setDept(d1);
		e2.setDept(d2);
		
		
		e1.display();
		
		System.out.println("Dept Id: "+e1.getDept().getDeptId());
		System.out.println("Name: "+e1.getDept().getDeptName());
		System.out.println("------------------------------------");
		
		e2.display();
		
		System.out.println("Dept Id: "+e1.getDept().getDeptId());
		System.out.println("Name: "+e1.getDept().getDeptName());
		System.out.println("------------------------------------");
		
		
		
		
		
		
		
		
		
		
		

	}

}
