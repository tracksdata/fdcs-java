package com;

import java.util.Scanner;

import com.sum.Sum;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ennter first no: ");
		int x = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int y = sc.nextInt();

		Sum s = new Sum();
		int res = s.add(x, y);
		System.out.println("Sum of " + x + " and " + y + " is " + res);
		sc.close();

	}

}
