/*
 The final local variable x cannot be assigned. It must be blank and not using a compound 
 assignment*/
package com.operators.unaryOparator.unaryoparator;

/**
 *
 * @author root
 */
public class Manager7 {

    public static void main(String[] argv) {
        final int x = 5;
        //int y = x++;
        System.out.println(x);
    }
}
