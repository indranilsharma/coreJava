/*
 Attach a D or d to double literals, but it is not necessary
 */
package com.datatype.Literal.floatingLiteral;

/**
 *
 * @author root
 */
public class Manager16 {
    public static void main(String[] argv){
        double d = 1.1D; // Optional, not required
        double g = 987.897;       // No 'D' suffix, but OK because the literal is a double by default

        System.out.println(d);
        System.out.println(g);
    }
}
