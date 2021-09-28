
package com.opps.constractor;

public class Manager3 {

	public Manager3() {
		System.out.println("no-arg()");
	}

	public Manager3(int i) {
		System.out.println("Manager3(int i)");
	}

	public static void main(String[] args) {
		new Manager3();
		System.out.println(".....................");
		new Manager3(200);
		System.out.println(".....................");
		new Manager3();
		System.out.println(".....................");
		new Manager3(400);

	}
}
