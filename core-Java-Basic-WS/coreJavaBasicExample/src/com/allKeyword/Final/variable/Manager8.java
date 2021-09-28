package com.allKeyword.Final.variable;

import java.awt.Point;

/**
 * A point representing a location in {@code (x,y)} coordinate space, specified
 * in integer precision.
 *
 * 
 * The final keyword means that the field cannot be changed once initialized
 */
public class Manager8 {
	
	public static final int TYPEA = 1;
	public static final int TYPEB = 2;
	private static int count = 0;

	 // a static method
	static void addOne() {
		count++;
	}

	static final String name = "Widget";
	static final Point varX;

	// start static initialization block
	static { 
		varX = new Point(0, 0);
	}

}
