package com.wrappersClass.floatDouble;

/**
 * byteValue
 * 
 * Returns the value of this {@code Integer} as a {@code byte}
 * after a narrowing primitive conversion.
 * @jls 5.1.3 Narrowing Primitive Conversions
 */

/* @return  the 
 * {@code double} value represented by this object
  converted to type {@code int}
  
   i.intValue() method returns the value of wrapper i as a Integer.
   i is 257.578 is double number when converted to an integer data type its value is 257.
*/
public class Manager4 {
	
    public static void main(String args[]) {
        Double i = new Double(257.578);  
        int x = i.intValue();
        System.out.print(x);

    }
}
