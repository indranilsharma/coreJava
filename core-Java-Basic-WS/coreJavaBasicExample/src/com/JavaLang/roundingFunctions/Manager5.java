package com.JavaLang.roundingFunctions;

/*Converts an angle measured in radians to an approximately
* equivalent angle measured in degrees. 
@param   angrad   an angle, in radians
* @return  the measurement of the angle {@code angrad}
*          in degrees.
* @since   1.2*/

public class Manager5 {
	public static void main(String args[]) {

		double x = 3.14;

		int y = (int) Math.toDegrees(x);

		System.out.print(y);

	}
}
