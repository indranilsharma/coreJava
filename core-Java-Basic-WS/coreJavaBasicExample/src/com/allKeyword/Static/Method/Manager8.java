/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;

public class Manager8 {

    static int i = 10;
    static int j = test();

    static int test() {
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("main start");
    	System.out.println(i);
        System.out.println("main call j");
        System.out.println(j);
        System.out.println("main end");

    }
}
