package com.wrappersClass.typeCasting.upCasting;

public class Manager5 {

	static void test(int i) {
		System.out.println("test()");
	}

	public static void main(String[] args) {
		byte b = 10;
		double d = 10.8;
		test(b);
		test((int) d);
		System.out.println(".........");
	}
}
