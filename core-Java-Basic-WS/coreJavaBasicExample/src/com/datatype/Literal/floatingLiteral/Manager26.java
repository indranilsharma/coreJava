/*
 Literals are used to create values that are assigned to variables
 */
package com.datatype.Literal.floatingLiteral;

/**
 *
 * @author root
 */
public class Manager26 {

    public static void main(String[] argv) {
        char c = 'b';          // char literal
        int i = 42;           // int literal
        boolean b = false;        // boolean literal
        double d = 2546789.343;  // double literal
        System.out.println(5); // 5 is a literal for int type
        System.out.println("c: " + c + " i: " + i + " b: " + b + " d " + d);

        int n = 42;
        long j = 4L; // appending L or l makes it a long
        long k = 0xFFFFFFL;
        byte b2 = 010; // an octal literal
        double f2 = 1.023; // double is assumed
        float d2 = 1.023f; // F or f makes it a float if F remove shows error

        System.out.println(n);
        System.out.println(j);
        System.out.println(k);
        System.out.println(b2);

        System.out.println(f2);
        System.out.println(d2);
    }
}
