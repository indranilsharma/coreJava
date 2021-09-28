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
public class Manager11 {

    static int test() {
        int i = 0;
        return i++;
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(test());
        System.out.println(i);
        System.out.println(i = test());
        System.out.println(i);

    }
}
