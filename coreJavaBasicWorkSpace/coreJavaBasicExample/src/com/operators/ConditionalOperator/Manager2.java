package com.operators.ConditionalOperator;

/*The ternary operator ? : has three operands and takes 
  the following form: operand1 ? operand2 : operand3
*/
public class Manager2 {
	public static void main(String args[]) {
		for (int i = 0; i < 10; ++i)
			System.out.print((i % 3 == 0) ? ("" + i) : "x");
	}
}
