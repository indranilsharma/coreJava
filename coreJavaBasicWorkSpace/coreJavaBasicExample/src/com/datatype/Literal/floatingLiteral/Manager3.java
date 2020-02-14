/*

 * float and double use 32 and 64 bits, respectively. 
Float literals end in F or f, double literals end in a digit or D or d.
Floating-point numbers are implicitly doubles (64 bits).

A floating-point literal with letter E or e (scientific notation)
A floating-point literal with suffix F or f, indicating a float literal
 */
package com.datatype.Literal.floatingLiteral;

/**
Variable c has been dynamically initialized to square root of a * a + b * b, during run time.
 */
public class Manager3 {
	public static void main(String args[]) {
		double a, b;
		a = 3.0;
		b = 4.0;
		double c = Math.sqrt(a * a + b * b);
		System.out.println(c);

	}
}
