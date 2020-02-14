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
public class Manager3 {
    public static void main(String [] ses) {
    // ~ operator inverts all the 1 bits in a binary value to 0s and all the 0
    // bits to 1s.
    int i = 1;
    i = ~i;
    System.out.println(i);//2
  }
}
