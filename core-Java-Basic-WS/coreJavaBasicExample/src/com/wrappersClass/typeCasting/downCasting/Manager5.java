package com.wrappersClass.typeCasting.downCasting;

public class Manager5 {


static double test(short s) {
	// int i = 10;
	// System.out.println("test()");
	return s;
}

public static void main(String[] args) {
	// int i = 50;
	byte b = 10;
	double d = test(b);
	// test(i);

	System.out.println(test(b));
	System.out.println("done");
}
}