/*
 * Two NaN values are defined in the java.lang package
A floating-point literal with suffix F or f, indicating a float literal
 */
package com.datatype.Literal.floatingLiteral;

/**
 *
 * @author root
 */
public class Manager11 {
    public static void main(String[] argv) {
    System.out.println(Float.NaN);
    System.out.println(Double.NaN);

    float y = 0.8F;
    float x = (float) Math.sqrt(y); // where y may be negative
    if (x == Float.NaN) {
      x = 0.0F; // WRONG, always false
    }
    if (Float.isNaN(x)) {
      x = 0.0F;
      // the right way to detect NaN
    }
    }
}
