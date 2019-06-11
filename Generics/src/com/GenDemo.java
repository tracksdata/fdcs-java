package com;


public class GenDemo<E> {
	
	void add(E x) {
		System.out.println(x.getClass().getTypeName()+" "+ x);
	}
	
	public static void main(String[] args) {
		
		
		GenDemo<String> g=new GenDemo<>();
		//g.add(3434);
		g.add("Abc");
		
		try {
			
			try {
				
			} catch (Exception e) {
				try {
					
				} catch (Exception e2) {
					try {
						
					} catch (Exception e3) {
						// TODO: handle exception
					}finally {
						try {
							
						} catch (Exception e4) {
							// TODO: handle exception
						}
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
		
		
	}

}
