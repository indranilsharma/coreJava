/*A floating-point literal with suffix F or f, 
 * indicating a float literal
 */
package com.datatype.Literal.floatingLiteral;

/**
 *
 * @author root
 */
public class Manager12 {
    public static void main(String[] argv) {
    float x = 1.123F;

    System.out.println(x < Float.NaN);
    System.out.println(x <= Float.NaN);
    System.out.println(x == Float.NaN);
    System.out.println(x > Float.NaN);
    System.out.println(x >= Float.NaN);

    System.out.println(Float.NaN == Float.NaN);
    System.out.println(Float.NaN != Float.NaN);

  }
}
