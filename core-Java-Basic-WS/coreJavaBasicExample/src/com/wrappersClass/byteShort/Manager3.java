package com.wrappersClass.byteShort;

/**
 * byteValue
 * 
 * Returns the value of this {@code Integer} as a {@code byte}
 * after a narrowing primitive conversion.
 * @jls 5.1.3 Narrowing Primitive Conversions
 */

/* i.byteValue() method returns the value of wrapper i as a byte value. i is 257, 
   range of byte is 256 therefore i value exceeds byte range by 1 hence
   1 is returned and stored in x.
*/
public class Manager3 {
	public static void main(String args[]) {
		Integer i = new Integer(257);
		byte x = i.byteValue();
		System.out.print(x);

	}
}
