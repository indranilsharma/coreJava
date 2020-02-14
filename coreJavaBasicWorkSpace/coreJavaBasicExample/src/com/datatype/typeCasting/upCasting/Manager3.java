package com.datatype.typeCasting.upCasting;

public class Manager3 {

	static void test1(double d) {
		System.out.println("test(double)");
	}

	public static void main(String[] args) {
		int i = 10;
		test1(i);
		System.out.println("......");
		test1((double) i);
		System.out.println("......");

	}
}
