package com.operators.booleanOperators;
/*
 * Operator | returns true if any one operand is true, thus �c = true | false� is true.
 *  Operator & returns a true if both of the operand is true thus d is false. 
 *  Ternary operator ?: assigns left of �:� if condition is true and right hand of �:� if condition is false. 
 * d is false thus e = d ? b : c , assigns c to e , e contains true.
*/

/**
 * Ternary operator ?: assigns left of �:� if condition is true and right hand
 * of �:� if condition is false. true ?: false A B A|B A&B A^B !A false false
 * false false false true true false true false true false false true true false
 * true true true true true true false false
 */

public class Manager7 {
	public static void main(String args[]) {
		boolean a = true;
		boolean x = false;

		boolean b = !true; // false
		boolean c = a | b; // true
		boolean d = a & b;// false
		boolean e = d ? b : a ? x : c;// false con1?res1 :cond2?res2 : else
		boolean f = d ? b : c;
		System.out.println(d + " " + x);
		System.out.println(e);
//		String s = (a == true) ? "true-part" : (b == true) ? "false-part" : "else-part";
	}
}