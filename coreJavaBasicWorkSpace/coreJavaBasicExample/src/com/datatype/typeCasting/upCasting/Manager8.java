package com.datatype.typeCasting.upCasting;

public class Manager8 {
	public static void main(String[] args) {
		double d = 10.8;
		float f = (float) d;
		int i = (int) f;
		byte b = (byte) i;
		System.out.println("d: " + d + " f: " + f + " i: " + i + " b: " + b);
		System.out.println("done");
	}
}
