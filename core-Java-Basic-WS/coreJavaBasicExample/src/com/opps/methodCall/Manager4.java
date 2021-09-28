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
public class Manager4 {

    static void test() {
        System.out.println("com.methodCall.Manager4.test()");
        if (true) {
            System.out.println("com.methodCall.Manager4.test() if");
            return;
        }
        System.out.println("test() end ");
    }

    public static void main(String[] args) {
        test();
        System.out.println("main() ");
    }
}
