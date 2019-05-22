package com;

public class StringArrayDemo {
	
	public static void main(String[] args) {
		
		
		String[] names= {"Abc","Xuz","test","83433","Praveen"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("----------------");
		
		// only on arrays -> SPecial loop type=> for each loop
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
	}

}
