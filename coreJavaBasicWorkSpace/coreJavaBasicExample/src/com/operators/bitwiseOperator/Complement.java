
/*
|	Bitwise OR
&	Bitwise AND
~	Bitwise Complement
^	Bitwise XOR
<<	Left Shift
>>	Right Shift
>>>	Unsigned Right Shift*/

package com.operators.bitwiseOperator;

/*35 = 00100011 (In Binary)

Bitwise complement Operation of 35
~ 00100011 
  ________
  11011100  = 220 (In decimal)*/

/*
 * Why are we getting output -36 instead of 220?
It's because the compiler is showing 2's complement of that number; 
negative notation of the binary number. */

public class Complement {

	public static void main(String[] args) {
		int number = 4, result;

		result = ~number;
		System.out.println(result);
	}

}