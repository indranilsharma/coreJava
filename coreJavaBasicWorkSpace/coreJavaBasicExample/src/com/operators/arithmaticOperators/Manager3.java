/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.arithmaticOperators;

/**
 *
 * @author root
 */
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
