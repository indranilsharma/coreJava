/*
Constant                    Interpretation                          Corresponding String

Float.MAX_VALUE             The largest number representable        3.40282e+038

Float.MIN_VALUE             The smallest number representable       1.4013e-045

Float.NEGATIVE_INFINITY     Negative divided by zero                -Infinity

Float.POSITIVE_INFINITY     Positive divided by zero                Infinity

Float.NaN                   Not a Number                            NaN
 */
package com.datatype.Literal.floatingLiteral;

/**
 *
 * @author root
 */

public class Manager10 {
    public static void main(String[] a) {
    double d = -10.0 / 0.0;
    float f=1.0f/0.0f;
    if (d == Double.NEGATIVE_INFINITY) {
      System.out.println("d just exploded: " + d);
    }
        if (f==Float.POSITIVE_INFINITY) {
            System.out.println("f:"+f);
        }
        
    }
}
