
/*
 * Note:
 * ------
 * 1. By default JVM adds a default constructor when you don't provide any constrctors
 */

class B {

	public B() {
		System.out.println("--- B Default ");
	}

	public B(int x) {
		System.out.println("B Argument");
	}

}

public class C extends B {

	public C() {
		System.out.println("C Default");
	}
	
	public C(int x) {
		super(34);
		System.out.println("C Argument");
	}

	public static void main(String[] args) {

		C c = new C(10);

	}

}
