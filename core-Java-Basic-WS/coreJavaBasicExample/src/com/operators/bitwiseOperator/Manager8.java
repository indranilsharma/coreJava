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
public class Manager8 {
    public static void main(String[] argv) {
    short flags = 20; // 0000 0000 0001 0100 or 0x0014
    short mask = 4; //   0000 0000 0000 0100
    short rslt = (short) (flags & mask);

    System.out.println(rslt);
  }
}
