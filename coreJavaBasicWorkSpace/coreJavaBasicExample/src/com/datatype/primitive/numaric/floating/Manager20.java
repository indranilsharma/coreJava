/*
 if a floating-point result is NaN,
  use the Float.isNaN or Double.isNaN static method
 */
package com.datatype.primitive.numaric.floating;

/**
 *
 * @author root
 */
public class Manager20 {
    public static void main(String[] argv) {
    float i = 1;
    float j = 1;

    System.out.println(i / (j - 1));
    System.out.println(Float.isNaN(i / (j - 1)));

  }
}
