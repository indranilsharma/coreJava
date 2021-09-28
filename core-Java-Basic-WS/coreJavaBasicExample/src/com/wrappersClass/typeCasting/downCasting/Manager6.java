package com.wrappersClass.typeCasting.downCasting;

public class Manager6 {

	static double test1(byte b) {
		// int i = 10;
		// System.out.println("test()");
		return b;
	}

	static double test2(byte b) {
		// int i = 10;
		// System.out.println("test()");
		return b;
	}

	public static void main(String[] args) {
		// int i = 50;
		byte b = 10;
		double d = test2(b);
		// test(i);

		// System.out.println(test(d));
		System.out.println("done");
	}
}