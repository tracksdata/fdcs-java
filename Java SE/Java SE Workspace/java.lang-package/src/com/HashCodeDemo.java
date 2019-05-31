package com;

import java.util.Objects;

/*
 * 
 *  Types of classes
 *  ----------------
 *  	1.Simple class
 *  	2.Complex class
 * 
 */

class Employee{
	
	int id;
	String name;
	double salary;
	
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee emp=(Employee) obj;
		
		return ((emp.id==id) && emp.name.equals(name));
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(id,name);
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Id is "+id+" and Name is "+name;
		}
	
}




public class HashCodeDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(20,"James");
		Employee e2=new Employee(20,"James");
		
		System.out.println("Hashcode of E1: "+e1.hashCode());
		System.out.println("Hashcode of E2: "+e2.hashCode());
		System.out.println("------------------");
		
		System.out.println("Identity Hashcode of E1: "+System.identityHashCode(e1));
		System.out.println("Identity Hashcode of E2: "+System.identityHashCode(e2));
		
		
		System.out.println("------------------");
		
		if(e1.equals(e2)) {
			System.out.println("Eual");
		}else {
			System.out.println("Not Equal");
		}
		
		
		System.out.println("------------------");
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		
		
		

	}

}
