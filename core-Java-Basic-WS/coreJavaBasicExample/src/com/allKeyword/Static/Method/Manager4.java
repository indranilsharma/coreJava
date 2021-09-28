/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;


public class Manager4 {

    static int i ;

    static void test1() {
        System.out.println("com.staticApp.Manager4.test1()" + i);
        i = 1;
    }

    static void test2() {
        System.out.println("com.staticApp.Manager4.test2()" + i);
        i = 2;
    }

    public static void main(String[] args) {
        test1();
        System.out.println("main() start " + i);
        test2();
        System.out.println("main() end " + i);
    }
}
