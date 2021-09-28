package com.operators.ConditionalOperator;

//nest conditional operators into one statement

public class Manager5 {
	public static void main(String[] args) {
		int s = 10;
		int n = 3;
		String status = (n < 4) ? "A" : (s > 8) ? "B" : "C";
		System.out.println(status);
	}
}
