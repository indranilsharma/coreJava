/*
|	Bitwise OR
&	Bitwise AND
~	Bitwise Complement
^	Bitwise XOR
<<	Left Shift
>>	Right Shift
>>>	Unsigned Right Shift

*The ^ operator compares corresponding bits of two operands.If corresponding bits are 
*different, it gives 1. If corresponding bits are same,it gives 0. For example,
*
*12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

Bitwise XOR Operation of 12 and 25
  00001100
| 00011001
  ________
  00010101  = 21 (In decimal)
*/

package com.operators.bitwiseOperator;

public class Xor {
	public static void main(String[] args) {
		int number1 = 1, number2 = 5, result;
		result = number1 ^ number2;
		System.out.println(result);
	}
}
