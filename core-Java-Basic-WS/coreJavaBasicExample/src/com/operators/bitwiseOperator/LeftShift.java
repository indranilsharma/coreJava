package com.operators.bitwiseOperator;

/*The left shift operator << shifts a bit pattern to the left by certain number of specified bits,
and zero bits are shifted into the low-order positions.
212 (In binary: 11010100)

212 << 1 evaluates to 424 (In binary: 110101000) mean shift toword's left 1 position after convert the result to decimal 
212 << 0 evaluates to 212 (In binary: 11010100)
212 << 4 evaluates to 3392 (In binary: 110101000000)
*/

public class LeftShift {
	public static void main(String[] args) {
		int number = 10;

		System.out.println(number << 1);//1010 10100
		System.out.println(number << 0);
		System.out.println(number << 4);
	}
}
