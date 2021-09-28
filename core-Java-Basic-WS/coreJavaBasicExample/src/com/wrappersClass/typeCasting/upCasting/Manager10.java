package com.wrappersClass.typeCasting.upCasting;

public class Manager10 {
	public static void main(String[] args) {
		short i = 20;
		double d = i;//up-casting
		double d1 = 20.2;
		//i=(short)d1;//down-casting
		System.out.println(d+","+i);
	}

}
