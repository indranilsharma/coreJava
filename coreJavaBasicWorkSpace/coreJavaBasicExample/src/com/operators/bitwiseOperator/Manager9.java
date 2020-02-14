/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.bitwiseOperator;

/**
 *
 * @author root
 */
public class Manager9 {
   public static void main(String[] argv) {
    test(1, 2);
  }

  static void test(int a, int b) {
    int c = a & b;
    System.out.println("Result AND & " + Integer.toBinaryString(c) + " = " + c);
    c = a | b;
    System.out.println("Result OR  | " + Integer.toBinaryString(c) + " = " + c);
    c = a ^ b;
    System.out.println("Result XOR ^ " + Integer.toBinaryString(c) + " = " + c);
    System.out.println("Complement of " + a + " = " + Integer.toBinaryString(~a));
    System.out.println("Complement of " + b + " = " + Integer.toBinaryString(~b));
  } 
}
