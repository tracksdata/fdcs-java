package com;

public class TwoD {

	public static void main(String[] args) {

		// int x[][]; // row and col

		int x[][] = { { 10, 20, 50 }, { 30, 40, 98 }, { 98, 43, 23 }, { 10, 20 } };

		// System.out.println(x[0][0]);
		// System.out.println(x[0][1]);
		// System.out.println(x[1][0]);
		// System.out.println(x[1][1]);

		for (int row = 0; row < x.length; row++) {

			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col] + " ");
			}

			System.out.println();
		}
		
		System.out.println("--------------------");
		
		for(int row[]:x) {
			
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

		// System.out.println(x.length);
	}

}
