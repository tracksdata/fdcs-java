package com;

public class Demo1 {

	public static void main(String[] args) {

		try {
			int x = 10;
			int y = x / 2;

			System.out.println("Y=" + y);
			int i[] = new int[1];
			i[0] = 100;

			Class.forName("com.Cognizant");

		} catch (ArithmeticException e) {
			System.out.println("--- Failed due to " + e);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("--- faile due to " + ae);
		} catch (Exception ee) {
			System.out.println("Due to " + ee);
		} finally {
			System.out.println("--- Always executes");
		}
		System.out.println("some statements");

	}

}
