package com;

/*
 * ------------------------------------------------------------------------------
 * 		Data Type			Size(bytes)		Wraper class type	default value
 * 	-------------------------------------------------------------------------
 * 		int					4				Integer					0
 * 		short				2				Short					0
 * 		byte				1				Byte					0
 * 		long				8				Long					0
 * 	------------------------------------------------------------------------
 * 		float				4				Float					0.0
 * 		double				8				Double					0.0
 * -------------------------------------------------------------------------
 * 		char				2				Character				blank space
 * --------------------------------------------------------------------------
 * 		boolean				1				Boolean					false
 */
public class Sample {
	
	int x;
	

	/*
	 * void f1(byte x) { System.out.println("byte: " + x); }
	 * 
	 */
	/*
	 * void f1(short x) { System.out.println("short: " + x); }
	 */

	/*
	 * void f1(long x) { System.out.println("long: " + x); }
	 * 
	 */

	/*
	 * void f1(int x) { System.out.println("Int: " + x); }
	 */

	void f1(float x) {
		System.out.println("float: " + x);
	}

	void f1(double x) {
		System.out.println("double: " + x);
	}

	public static void main(String[] args) {

		int x;
		Sample s = new Sample();

		

	}

}
