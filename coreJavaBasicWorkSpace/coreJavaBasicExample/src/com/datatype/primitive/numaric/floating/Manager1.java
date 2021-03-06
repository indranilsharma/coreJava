package com.datatype.primitive.numaric.floating;

/**
 *
 * For floating point literals, we have constant value to represent (10/0.0) infinity 
 * either positive or negative and also have NaN (not a number for undefined like 0/0.0)
 * ,but for the integral type, we don't have any constant that's why we get an arithmetic exception.
 */
public class Manager1 {

	/**
	 * @param args the command line arguments
	 *            
	 */

	public static void main(String args[]) {
		double a, b, c;
		a = 3.0 / 0;
		b = 0 / 4.0;
		c = 0 / 0.0; //NaN

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
