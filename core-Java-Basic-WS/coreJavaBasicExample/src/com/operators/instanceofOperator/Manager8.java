package com.operators.instanceofOperator;

public class Manager8 {
	public static void main(String[] argv) {
		boolean[] boolArray = new boolean[2];

		if (boolArray instanceof boolean[]) {
			System.out.println("it is an boolean array");
		}
	}
}
