/*
 //For OR operations, 0 OR 0 produces 0. Any other combination produces 1.
//In the OR operation, you get a 1 result if either the first operand or the second operand (or both) is 1. 
*/
package com.operators.bitwiseOperator;


public class Manager7 {
    public static void main(String[] argv) {
    int i = 2;//0010
    int b = 4;//0100
    System.out.println(i | b);//6
  }
}
