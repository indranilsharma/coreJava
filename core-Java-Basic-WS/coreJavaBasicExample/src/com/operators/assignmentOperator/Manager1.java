/*
 x = y      The variable x is assigned the value of y.
x += y     The variable x is assigned the value of x + y.
x -= y     The variable x is assigned the value of x - y.
x *= y     The variable x is assigned the value of x * y.
x /= y     The variable x is assigned the value of x / y.
x %= y     The variable x is assigned the value of x % y.
x &= y     The variable x is assigned the value of x & y.
x |= y     The variable x is assigned the value of x | y.
x ^= y     The variable x is assigned the value of x ^ y.
x <<= y    The variable x is assigned the value of x <<= y.
x >>= y    The variable x is assigned the value of x >>= y.
x >>>= y   The variable x is assigned the value of x >>>= y.


*/
package com.operators.assignmentOperator;

/**
 *
 * @author root
 */
public class Manager1 {
    public static void main(String[] args) {
    int weight = 700;
    char sex = 'm';
    double myDouble = 1.6;
    if (weight >= 500) {
      System.out.println("weight >= 500");
    }
    if (myDouble > 1.6) {
      System.out.println("myDouble > 1.6");
    }
    if (sex <= 'f') {
      System.out.println("sex <= 'f'");
    }
   
  }
}
