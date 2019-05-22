package com;

/*
 * 		Arrays
 * 		-------
 * 	-> Collection of same data type
 * 	-> Each array is an object
 * 	-> Works with index approach
 * 	-> index starts with zero and ends size-1
 * 
 * 		Two Types
 * 		---------
 * 		1. 1-D
 * 		2. 2-D
 * 
 *     Array Operations
 *     ------------------
 *     1. Searching
 *     2. Adding
 *     3. removing
 *     4. Updating
 *     5. Displaying
 * 
 * 
 */

public class Test {
	
	static void f1(int[] dummy) {
	
		dummy[0]=100;
		dummy[1]=200;
		
		System.out.println("-- In fun");
		
		System.out.println(dummy[0]); 
		System.out.println(dummy[1]);
		
	}
	
	public static void main(String[] args) {
		
		
		// 1-D => Row wise -> Single row
		
		int x[]= {}; // Blank array
		int y[]= {10,20,30,40,50};
		
		// accessing data with index
		
		System.out.println(y[0]); // 0th index
		System.out.println(y[1]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		System.out.println(y[4]);
		
		System.out.println("---------");
		
		f1(y);
		
		System.out.println("In Main ");
		
		System.out.println(y[0]); // 0th index
		System.out.println(y[1]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		System.out.println(y[4]);
		
		
		// 1-D Array sysntax rules
		
		// Valid
		int i[];
		int[] i1;
		
		//----------------
		
		int[] i2= {};
		int[] i3= {};
		
		//---------------
		
		// Array with content
		
		int[] i4= {1,2,3};
		int i5[]= {65,45};
		int []i6= {1,2,34};
		// Invalid
		
		//[]int i6= {1,2,3};
		
		
		
		//------------------------
		
		// Array with fixed size
		
		int[] i7=new int[5];
		int i8[]=new int[10];
		int []i9=new int[10];
		
		// Invalid
		
		//int[10] i10=new int[];
		//	int[] i10=new int[];
		//	int i10[]=int[10];
		
		
		i7[3]=1000;
		
		// use for loop to iterate an array
		
		System.out.println("-----------------");
		for(int col=0;col<i7.length;col++) {
			
			System.out.println(i7[col]);
			
		}
		
		
		
		
		
	}

}
