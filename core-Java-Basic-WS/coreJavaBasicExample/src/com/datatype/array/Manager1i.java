package com.datatype.array;

/*Arrays can hold primitives or objects, but the array itself is always an object.
When you declare an array, the brackets can be to the left or right of the variable name.
It is not legal to include the size of an array in the declaration.
An array of objects can hold any object that passes the IS-A (or instanceof) test
 for the declared type of the array. 

To create and use an array, you must follow three steps:

   1. Declaration
   2. Construction
   3. Initialization*/

class Manager1i {
	public static void main(String[] args) {
		int[] ints;
		ints = new int[4];

		for (int i = 0; i < ints.length; i++) {
			ints[i] = i;
			System.out.print(i + " ");
		}
	}
}