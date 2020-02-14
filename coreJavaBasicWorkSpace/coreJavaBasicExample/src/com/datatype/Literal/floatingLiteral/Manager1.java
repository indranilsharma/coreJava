package com.datatype.Literal.floatingLiteral;

public class Manager1 {
	public static void main(String[] argv) {
		int n = 42;
		long j = 4l; // appending L or l makes it a long
		long k = 0xFFFFFFL;
		byte b2 = 010; // an octal literal
		double f2 = 1.023; // double is assumed
		float d2 = 1.023F; // F or f makes it a float

		System.out.println(n);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b2);

		System.out.println(f2);
		System.out.println(d2);
	}
}
