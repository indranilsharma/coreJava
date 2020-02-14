/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.unaryOparator.unaryoparator;

/**
 *
 * @author root
 */
public class Manager4 {

    public static void main(String[] aStrings) {
        //The ++ and -- operators modify the value of an expression by adding or subtracting 1.
        int i = 0;
        i++;
        System.out.println(i);
        --i;
        System.out.println(i);

        byte b = 1;
        byte b1 = (byte) -b;
        System.out.println("b :" + b);
    }
}
