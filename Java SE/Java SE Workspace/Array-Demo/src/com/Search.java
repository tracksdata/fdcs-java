package com;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		int[] nos = { 76, 43, 12, 413, 55, 332, 211 };
		int key;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < nos.length; i++) {
			System.out.print(nos[i] + "   ");
		}

		System.out.println();
		System.out.println("Enter Element to find: ");

		key = sc.nextInt();

		boolean found = false;
		int position = 0;

		for (int i = 0; i < nos.length; i++) {
			if (nos[i] == key) {
				found = true;
				position = i;
				break;
			}
		}

		if (found == true) {
			System.out.println(key + " elemenet found at " + position);
		} else {
			System.out.println(key + " not found in the array");
		}

	}

}
