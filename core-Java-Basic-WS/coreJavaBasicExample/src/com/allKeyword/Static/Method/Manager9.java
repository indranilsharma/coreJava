/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;

public class Manager9 {

    static int i = test1() + test2();

    static int test1() {
        return 1;
    }

    static int test2() {
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("main start");
    	System.out.println(i);
    }
}
