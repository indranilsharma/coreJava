/*
 
*/
package com.operators.assignmentOperator;

/*
 * Operator ++ has higher precedence than multiplication operator,
  *, x is incremented to 9 than multiplied with 3 giving 27.
279 because incremented to 9 then 3 multiply rest treat as a string   */

public class Manager8 {
	public static void main(String args[]) {
		int x = 8;
		System.out.println(++x * 3 + "" + x);
		// 279 because incremented to 9 then 3 multiply rest treat as a string

	}
}
