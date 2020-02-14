/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.methodCall;

/**
 *
 * @author root
 */
public class Manager13 {
    static int test(int i) {
        return i--;
    }

    static int test1(int j) {
        return ++j;
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        System.out.println(test(i++));
        System.out.println(i);
        i = 0;
        System.out.println(test(i--));
        System.out.println(i);

        System.out.println("...........................");
        int j = 0;
        System.out.println(--j);
        System.out.println(test(--j));
        System.out.println(j);
        i = test(j);
        System.out.println(j);
    }
}
