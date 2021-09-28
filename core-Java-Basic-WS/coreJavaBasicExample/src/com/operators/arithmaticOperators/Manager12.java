/*
 Using % with floating-point primitives produces results similar to the integer operation
the special floating-point values, such as NaN and POSITIVE_INFINITY, can result.
 */
package com.operators.arithmaticOperators;

/*
Size:
8 byte ( 64 bits )

Values:
upto 16 decimal digits

Default Value:
0.0
 */

public class Manager12 {

	public static void main(String[] argv) {
		double i = 9D;
		double j = 2D;
		double z = i % j;// 1

		double i1 = -9;
		double j1 = 2;
		double z1 = i1 % j1;// Nagative infinity
		System.out.println(z1);

		double i2 = -9;
		double j2 = 0;
		double z2 = i2 % j2;
		double z3 = i2 / j2;
		System.out.println(z3);// NaN

		System.out.println(z2);// NaN

		System.out.println(z);// 1.0 because z is also double type
		System.out.println(1.2 % 3);// floating result
	}
}
