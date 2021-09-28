package com.JavaLang.roundingFunctions;

/*
* @param    :  a value.
* @return   : the smallest (closest to negative infinity)
*          floating-point value that is greater than or equal to
*          the argument and is equal to a mathematical integer.
*
      public static double ceil(double a) {
      return StrictMath.ceil(a);    // default impl. delegates to StrictMath
}
*/



public class Manager3 {
	public static void main(String[] args) {
		double x = 3.14;

		int y = (int) Math.ceil(x);

		System.out.print(y);
	}
}
