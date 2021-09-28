package com.opps.Interfaces;

interface A1 {
	// new feature java 8

	/*
	 * Suppose we need to add a new function in an existing interface. Obviously
	 * the old code will not work as the classes have not implemented those new
	 * functions. So with the help of default implementation, we will give a
	 * default body for the newly added functions. Then the old codes will still
	 * work.
	 */
	default public void print() {
		System.out.println("Default method");
	}

	/*
	 * Another feature that was added in JDK 8 is that we can now define static
	 * methods in interfaces which can be called independently without an objec
	 */

	static public void display() {
		System.out.println("Static method");
	}
}

public class Default_implementation implements A1 {

	public static void main(String[] args) {

		Default_implementation obj = new Default_implementation();
		obj.print();
		A1.display();

	}

}
