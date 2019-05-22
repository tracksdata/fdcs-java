package com;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int size = sc.nextInt();

		int nos[] = new int[size];

		System.out.println("Input " + size + " elements");

		for (int i = 0; i < size; i++) {
			nos[i] = sc.nextInt();
		}

		System.out.println("------------------");
		System.out.println("-- OrginAl data");
		for (int i = 0; i < nos.length; i++) {
			System.out.println(nos[i]);
		}

	
		System.out.println("reverse Order");

		for(int i=nos.length-1;i>=0;i--) {
		 System.out.println(nos[i]);
		 }
		
		System.out.println("-------------------");
		Arrays.sort(nos);
		int postion = Arrays.binarySearch(nos, 12);

	
		System.out.println("-- SOrted order");
		for (int no : nos) {
			System.out.println(no);
		}

		System.out.println("-------------");

		if (postion >= 0)
			System.out.println(12 + " found at " + postion);
		else
			System.out.println("Not found");

	}

}
