package com.java8newfeature.common.methodrefarence;

import java.util.function.BiFunction;

interface ArithmeticDemo {
	static int add(int a, int b) {
		int result = (a + b);
		System.out.println(result);
		return result;
	}
}

public class MethodrefarencePredifiendSattic {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> obj = ArithmeticDemo::add;
		//int result = 
				obj.apply(20, 40);
		//System.out.println(result);
	}

}