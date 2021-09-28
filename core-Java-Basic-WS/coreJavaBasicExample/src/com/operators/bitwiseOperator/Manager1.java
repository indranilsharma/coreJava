
package com.operators.bitwiseOperator;

/**
 * | Bitwise OR & Bitwise AND ~ Bitwise Complement ^ Bitwise XOR << Left Shift
 * >> Right Shift >>> Unsigned Right Shift
 */
public class Manager1 {
	public static void main(String[] argv) {
		System.out.println(~5); // 4 (-) stands for 2 compliment
		System.out.println(3 & 4);// 0
		System.out.println(3 | 4);// 7

		/*
		 * This operator is binary operator, denoted by ‘^’. It returns bit by
		 * bit XOR of input values, i.e, if corresponding bits are different, it
		 * gives 1, else it gives 0.
		 */ 
		System.out.println(5 ^ 4);// 1
	}
}
