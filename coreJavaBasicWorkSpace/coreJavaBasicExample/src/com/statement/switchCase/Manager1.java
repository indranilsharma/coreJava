package com.statement.switchCase;

/*corresponding case and default case must be execute*/
public class Manager1 {
	public static void main(String[] argv) {
		int x = 2;
		switch (x) {
		case 1:
			System.out.println("x is equal to 1");
			break;
		case 2:
			System.out.println("x is equal to 2");
			break;
		case 3:
			System.out.println("x is equal to 3");
			break;
		default:
			System.out.println("Still no idea what x is");
		}

	}
}