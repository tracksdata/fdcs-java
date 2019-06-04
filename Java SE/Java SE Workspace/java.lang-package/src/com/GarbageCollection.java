package com;

/*
 * 	Notes
 * --------
 * 
 * 	-> If any object in the class is eligible for garbage collection, then JVM automatically
 *     un-references that object from 'Heap Memory'
 *  -> assigning 'null' to any object, then that object memory is de-referenced
 *  
 *  
 */

class Person {
	
	int x;
	float f;
	long ll;
	double dd;
	
	static int count=1;
	

	@Override
	protected void finalize() throws Throwable {

		System.out.println("--- Pereson Object is garbage collected.."+count++);
	}

}

public class GarbageCollection {

	public static void main(String[] args) {

		//Person p = new Person();
		//p = null;
		
		Runtime rt=Runtime.getRuntime();
		System.out.println("Total Memory: "+rt.totalMemory());
		
		for(int i=1;i<=9000000;i++) {
			Person p=new Person();
			
		}
		
		System.out.println("Available memory: "+rt.freeMemory());
		System.out.println("Memory Used: "+(rt.totalMemory()-rt.freeMemory()));
		
		//System.gc();
		

		System.out.println("--- Done ---");
	}

}
