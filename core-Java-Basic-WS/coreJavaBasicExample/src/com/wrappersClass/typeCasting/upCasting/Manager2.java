package com.wrappersClass.typeCasting.upCasting;

public class Manager2 {
	public static void main(String[] args) {

		byte b = 10;
		int i = (int) b;
		double d1 = i;
		double d2 = (double) i;
		System.out.println("done");
	}
}
