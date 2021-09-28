/*
IIB scope
 */
package com.datatype.primitive.numaric.integer;

/**
 *
Second print statement doesn’t have access to y ,
scope y was limited to the block defined after initialization of x.
 */
public class Manager8 {

	public static void main(String args[]) {
		int x;
		x = 5;
		{
			int y = 6;
			System.out.print(x + " " + y);
		}
		// System.out.println(x + " " + y);
	}
}
