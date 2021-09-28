package com.operators.instanceofOperator;

/*Using the instanceof operator to test whether a reference
refers to an array: instanceof Operator
*/

/*
instanceof checks whether the object is an array.
instanceof checks whether the element type of that array is some subclass of the element type 
of the right argument. 
*/

public class Manager7 {
	public static void main(String[] argv) {

		int[] intArray = new int[2];
		if (intArray instanceof int[]) {
			System.out.println("it is an int array");
		}
	}
}
