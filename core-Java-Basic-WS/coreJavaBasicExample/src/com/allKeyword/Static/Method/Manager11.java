/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;


public class Manager11 {

    static int i = test();

    static int test() {
        System.out.println("test()");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("main()--");
        System.out.println(i);
    }
}