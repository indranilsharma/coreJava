
/*
|	Bitwise OR
&	Bitwise AND
~	Bitwise Complement
^	Bitwise XOR
<<	Left Shift
>>	Right Shift
>>>	Unsigned Right Shift*/

package com.operators.bitwiseOperator;

/*12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

Bit Operation of 12 and 25
  00001100
& 00011001
  ________
  00001000  = 8 (In decimal)*/

public class BitwiseAND {
	public static void main(String[] args) {
		int number1 = 12, number2 = 25, result;
		result = number1 & number2;
		System.out.println(result);
	}
}
