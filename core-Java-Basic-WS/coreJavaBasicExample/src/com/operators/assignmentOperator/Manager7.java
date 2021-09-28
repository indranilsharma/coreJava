
package com.operators.assignmentOperator;

/**
 * Operator ++ has the highest precedence than / , and +.
 * 
 * var2 is incremented to 7 and then used in expression, 
 * var3 = 7 * 5 / 7 + 7, gives 12.
 */
public class Manager7 {
	public static void main(String args[]) {
		int var1 = 5;
		int var2 = 6;
		int var3;
		var3 = ++var2 * var1 / var2 + var2;// (7*5/7)+7 12
		System.out.print(var3);
	}
}