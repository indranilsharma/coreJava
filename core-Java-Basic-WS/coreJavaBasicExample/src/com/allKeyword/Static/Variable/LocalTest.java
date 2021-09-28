package com.allKeyword.Static.Variable;

class Manager4 {
	static int i;

	public static void print() {

		// Static local variables are not allowed
		// static int j;

		System.out.println("static method "+i);
	}
}

public class LocalTest {

	public static void main(String[] args) {
          Manager4.print();
	}

}
