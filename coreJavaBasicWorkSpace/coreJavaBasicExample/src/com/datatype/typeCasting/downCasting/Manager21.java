package com.datatype.typeCasting.downCasting;

public class Manager21 {
	public static void main(String args[]) {
		double a = 295.04;
		int b = 300;
		byte c = (byte) a;
		byte d = (byte) b;
		b=(int) a;//down-casting
		System.out.println(c + " " + d);
	}
}
