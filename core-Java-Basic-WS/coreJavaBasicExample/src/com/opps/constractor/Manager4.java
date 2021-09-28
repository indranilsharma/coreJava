
package com.opps.constractor;

public class Manager4 {

	public Manager4() {
		System.out.println("Manager4()");
	}

	public Manager4(int i, double d) {
		System.out.println("Manager4(int i, double d)");
		System.out.println(" " + i + "," + d);

	}

	public Manager4(double d, float f) {
		System.out.println("Manager4(double d, float f)");
		System.out.println(" " + d + "," + f);

	}

	public Manager4(boolean b, char c) {
		System.out.println("Manager4(boolean b)");
		System.out.println(" " + b + "," + c);

	}

	public Manager4(String s) {
		System.out.println("Manager4(String s)");

	}

	public static void main(String[] args) {
		new Manager4();
		new Manager4(7, 4.5);
		new Manager4(7.008, 2.02f);
		new Manager4(true, 'I');
		new Manager4("Football");

	}
}
