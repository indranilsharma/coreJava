/*
 Instead, the result is one of the special values NaN (Not a Number), 
 NEGATIVE_INFINITY,or POSITIVE_INFINITY that are defined 
 in the Float and Double wrapper classes.
 */
package com.datatype.primitive.numaric.floating;

/**
 *
 * @author root
 */
public class Manager19 {
    public static void main(String[] argv) {
    double i = 1;
    double j = 1;

    System.out.println(i / (j - 1));
    System.out.println(Double.isNaN(i / (j - 1)));

  }
}