package com.allKeyword.Final.variable;

public class Test {

	/*
	 * You can initialize a final variable when it is declared.This approach is
	 * the most common. A final variable is called blank final variable,if it is
	 * not initialized while declaration. Below are the two ways to initialize a
	 * blank final variable. A blank final variable can be initialized inside
	 * instance-initializer block or inside constructor. If you have more than
	 * one constructor in your class then it must be initialized in all of them,
	 * otherwise compile time error will be thrown. A blank final static
	 * variable can be initialized inside static block.
	 */
	
	// initilised
	final int THRESHOLD = 4;

	//black final variable
	final int CAPACITY;
	
	// initised thorgh IIB
	{
		CAPACITY = 5;
		System.out.println("initised thorgh IIB "+CAPACITY);
	}

	//black final variable 
	final int MINIMUM;

	//initised through constuctor
	Test() {
		MINIMUM = 2;
		System.out.println("initised through constuctor " + MINIMUM);
	}

	//blank final static variable
	final static float EULERCONSTANT;

	//initilised through static block
	static {
		EULERCONSTANT = 1f;
		System.out.println("initilised through static block "+EULERCONSTANT);
	}

	//final static variable inilised
	static final double PI = 3.141592653589793;

	public static void main(String[] args) {
     
		Test obj = new Test();
		System.out.println("initilised non statoc" +obj.THRESHOLD);
				
		System.out.println("initilised static "+PI);
	}

}
