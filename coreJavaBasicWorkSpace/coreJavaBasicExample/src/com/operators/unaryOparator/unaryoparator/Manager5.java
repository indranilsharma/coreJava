/*
 Initial Value of x         Expression            y       x

5                          y = x++               5       6

5                          y = ++x               6       6

5                          y = x--               5       4

5                          y = --x               4       4

When using a prefix expression, the value returned is the value that is calculated after the prefix operator is applied. 
When using a postfix expression, the value returned is the value of the expression before the postfix operator is applied. 

 */
package com.operators.unaryOparator.unaryoparator;

/**
 *
 * @author root
 */
public class Manager5 {
    public static void main(String[] argv) {
    int x = 10;
    int y = ++x; // The value assigned to y is 11
    System.out.println(x);
    System.out.println(y);
    x = 10;
    y = x++; // The value assigned to y is 10
    System.out.println(x);
    System.out.println(y);

    x = 10;
    y = --x; // The value assigned to y is 9
    System.out.println(x);
    System.out.println(y);

    x = 10;
    y = x--; // The value assigned to y is 10

    System.out.println(x);
    System.out.println(y);
  }
}
