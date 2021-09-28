package com.operators.bitwiseOperator;

/*The right shift operator >> shifts a bit pattern to the right by certain number of specified bits.
212 (In binary: 11010100)

212 >> 1 evaluates to 106 (In binary: 01101010)
212 >> 0 evaluates to 212 (In binary: 11010100)
212 >> 8 evaluates to 0 (In binary: 00000000)
*
*
*/
public class RightShift {
public static void main(String[] args) {
	int number = 3;
	
	//right shift operator
	System.out.println(number >> 1); //0011 --0001
	System.out.println(number >> 0); // no change
	System.out.println(number >> 8); //
}
}
