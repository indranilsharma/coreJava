package com.wrappersClass.character;

/**
 * The constant value of this field is the largest value of type {@code char},
 * {@code '\u005CuFFFF'}
 * 
 * Character.MAX_VALUE returns the largest character value, which is of
 * character ‘?’.
 * 
 *The constant value of this field is the smallest value of type
  * {@code char}, {@code '\u005Cu0000'}.
 * Character.MIN_VALUE returns the smallest character value, which is of space character ‘ ‘..
 */

public class Manager5 {

	public static void main(String args[]) {
		int a = Character.MAX_VALUE;
		int b = Character.MIN_VALUE;
		System.out.print((char) a);
		System.out.println((char) b);

	}
}
