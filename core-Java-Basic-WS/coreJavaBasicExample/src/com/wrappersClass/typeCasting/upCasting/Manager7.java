package com.wrappersClass.typeCasting.upCasting;

public class Manager7 {

	static int test(double d) {
		return (int) d;
	}

	public static void main(String[] args) {
		long log = test(10.2);
		System.out.println(log);
	}
}
