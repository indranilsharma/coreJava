/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;

/**
 *
 * @author root
 */
public class Manager10 {

    static int i = 10;
    static int j = test1();

    static int test1() {
        return i;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
    }
}
