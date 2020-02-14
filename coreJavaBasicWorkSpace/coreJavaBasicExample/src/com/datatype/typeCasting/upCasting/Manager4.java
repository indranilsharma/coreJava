package com.datatype.typeCasting.upCasting;

public class Manager4 {

	static int test1() {
		byte b = 10;
		return b;
		//System.out.println("test(double)");
	}

	static int test2() {
		byte b = 10;
		return (int)b;
		//System.out.println("test(double)");
	}

	public static void main(String[] args) {
		double d1 = test1();
		double d2 = (double)test2();
		//int i = 10;
//		test1(i);
		System.out.println("......");
/*		test1((double) i);
		System.out.println("......");
*/
	}
}
