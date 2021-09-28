
package com.operators.arithmaticOperators;

/*In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long,
which has a minimum value of 0 and a maximum value of 264-1. The Long class also contains 
methods like compareUnsigned*/

public class Manager3 {
    public static void main(String[] argv) {

    int a = 123, b = 23, c, d;
    long e, f;

    c = a * b / b;
    d = a / b * b;
    System.out.println("a is " + a + "\nb is " + b + "\nc is " + c + "\nd is " + d);

    e = (long) a * b / b;
    f = (long) a / b * b;
    System.out.println("\ne is " + e + "\nf is " + f);

  }
}
