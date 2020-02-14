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
public class Manager3 {
    public static void test1() {
        System.out.println("test1()");
    }

    public static void main(String[] args) {
        System.out.println("main() begain");
        test1();
        System.out.println("---------");
        Manager2.test2();
        System.out.println("---------");

        System.out.println("main() end");
    }

   
}
