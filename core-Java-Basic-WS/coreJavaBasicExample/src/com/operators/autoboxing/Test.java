package com.operators.autoboxing;

public class Test {

	/*
	 * values from -128 to 127 are cached, so the same objects are returned. The
	 * implementation of valueOf() uses cached objects if the value is between
	 * -128 to 127. If we explicitly create Integer objects using new operator,
	 * we get the output as “Not Same”. See the following Java program. In the
	 * following program, valueOf() is not used.
	 */

	public static void main(String[] args) {
		Integer x = 200, y = 200;
		Integer a = 125, b = 125;
		if (x == y) {
			System.out.println("same-1");
		} else {
			System.out.println("other-1");
		}
		if (a == b) {
			System.out.println("same-2");
		} else {
			System.out.println("other-2");
		}

	}

}
