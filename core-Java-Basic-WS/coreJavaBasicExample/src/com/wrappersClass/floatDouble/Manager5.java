package com.wrappersClass.floatDouble;

/**
 * byteValue
 * 
 * Returns the value of this {@code Integer} as a {@code byte}
 * after a narrowing primitive conversion.
 * @jls 5.1.3 Narrowing Primitive Conversions
 */

/* Returns the value of this {@code Double} 
 * as a {@code float}
 * after a narrowing primitive conversion.
  
floatValue() converts the value of wrapper i into float,
 since float can measure till 5 places after decimal hence 257.57812 
 is stored in floating point variable x.
*/
public class Manager5 {
	
    public static void main(String args[]) {
    Double i = new Double(257.578123456789);  
        float x = i.floatValue();
        System.out.print(x);
    }
}
