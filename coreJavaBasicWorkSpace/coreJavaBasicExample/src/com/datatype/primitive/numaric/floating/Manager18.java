/*
unless you append an F or f to indicate the 32-bit float primitive.
 */
package com.datatype.primitive.numaric.floating;

/**
 *
 * @author root
 */
public class Manager18 {
    public static void main(String[] argv) {
    double f2 = 1.023; // double is assumed
    float d2 = 1.023f; // F or f makes it a float
    //float d2 = 1.023; //without f can't able declare a variable
    System.out.println(f2+" "+d2);
  }
}