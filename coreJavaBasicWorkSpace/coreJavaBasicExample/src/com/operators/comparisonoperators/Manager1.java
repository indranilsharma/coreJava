/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.comparisonoperators;

/**
 *
 * @author root
 */
public class Manager1 {

    public static void main(String[] argv) {
        int i = 0;
        int j = 1;
        System.out.println(i > j);

        int k = 0;
        double d = 0.1;

        if (k < d) {//int and double both are compatible type
            System.out.println("ok");
        }

    }
}