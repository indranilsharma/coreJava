package com.datatype.typeCasting.upCasting;

public class Manager6 {

	static int test(double d) {
		return (int) d;
	}

	public static void main(String[] args) {
		long log = test(10.2);
		System.out.println(log);
	}
}
