package com.wrappersClass.typeCasting.downCasting;

//byte < short < int < long < float < double
//auto casting
public class Manager1 {
	public static void main(String[] args) {
		int i = 10;
		double d = i; // double8 int4
		byte b = 10;
		int j = b;
		short s = 20;
		double d1 = s;//double8 short2
		int k = 50;
		float f = k;//float4 int4
		//k=f; //vice versa not possible
		System.out.println(
				" i:" + i + " d:" + d + " b:" + b + " j:" + j + " s:" + s + " d1:" + d1 + " k:" + k + " f:" + f);
		System.out.println("done");
	}
}
