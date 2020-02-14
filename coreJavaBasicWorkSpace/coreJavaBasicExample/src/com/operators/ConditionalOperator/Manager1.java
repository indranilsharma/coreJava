package com.operators.ConditionalOperator;

//The conditional operator ?: (a ternary operator)

public class Manager1 {

	public static void main(String[] argv) {
		boolean x = true;
		int a = 0;
		int b = 1;
		int c = 2;

		if (x) {
			a = b;
		} else {
			a = c;
		}

		a = x ? b : c;
		System.out.println(a);
	}
}
