package com.operators.autoboxing;

public class Test1 {

	/*
	 * If we explicitly create Integer objects using new operator, we get the
	 * output as “Not Same”. See the following Java program. In the following
	 * program, valueOf() is not used.
	 */
	public static void main(String[] args) {
		Integer x = new Integer(10), y = new Integer(10);
		if (x == y) {
			System.out.println("same-1");
		} else {
			System.out.println("other-1");
		}
	}

}
