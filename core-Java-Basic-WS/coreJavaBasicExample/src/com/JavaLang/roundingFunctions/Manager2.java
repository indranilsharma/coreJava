package com.JavaLang.roundingFunctions;

/*
*    The class {@code Math} contains methods for performing basic
*    numeric operations such as the elementary exponential, logarithm,
*    square root, and trigonometric functions.
     Returns the absolute value of a {@code double} value.
  
               abs function
     * If the argument is not negative, the argument is returned.
     * If the argument is negative, the negation of the argument is returned.
     * Special cases:
     * <ul><li>If the argument is positive zero or negative zero, the result
     * is positive zero.
     * <li>If the argument is infinite, the result is positive infinity.
     * <li>If the argument is NaN, the result is NaN.</ul>
     * In other words, the result is the same as the value of the expression:
     * <p>{@code Double.longBitsToDouble((Double.doubleToLongBits(a)<<1)>>>1)}
     *
     * @param   a   the argument whose absolute value is to be determined
     * @return  the absolute value of the argument.
     
     public static double abs(double a) {
        return (a <= 0.0D) ? 0.0D - a : a;
    }
*/




public class Manager2 {
	public static void main(String[] args) {
		double x = 3.14;

		int y = (int) Math.abs(x);
		System.out.println(y);

	}

}