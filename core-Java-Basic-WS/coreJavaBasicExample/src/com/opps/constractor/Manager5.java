
package com.opps.constractor;

public class Manager5 {

	public Manager5() {
		System.out.println("Manager5()");

	}

	public Manager5(int i, double d) {
		this(115);// curent clasc constractor with parameter
		System.out.println("Manager5(int i,double d)");

	}

	public Manager5(int i) {
		this();// curent clasc constractor
		System.out.println("Manager5(int i)");
	}

	public static void main(String[] args) {
		new Manager5();
		System.out.println("............");
		new Manager5(110);
		System.out.println(".......");
		new Manager5(110, 4.7d);
		System.out.println(".......");

	}
}
