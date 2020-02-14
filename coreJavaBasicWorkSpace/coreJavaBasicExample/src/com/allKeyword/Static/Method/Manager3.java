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
public class Manager3 {

    static int i;

    static void test() {
        System.out.println("com.staticApp.Manager3.test()" + i);
    }

    public static void main(String[] args) {
        System.out.println("com.staticApp.Manager3.main()");
        i = 20;
        test();
    }
}
