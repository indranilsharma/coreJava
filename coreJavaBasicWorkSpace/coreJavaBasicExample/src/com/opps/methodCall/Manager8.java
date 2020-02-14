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
public class Manager8 {

    static int test1() {
        System.out.println("com.methodCall.Manager7.test()1");
        int i = 85;
        return i;
    }

    public static void main(String[] args) {
        System.out.println("com.methodCall.Manager7.main() begain");
        test1();
        System.out.println(test1());
        System.out.println(test1() + test1());
        System.out.println("com.methodCall.Manager7.main() end");
    }
}
