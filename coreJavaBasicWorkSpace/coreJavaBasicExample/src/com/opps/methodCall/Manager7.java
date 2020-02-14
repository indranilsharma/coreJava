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
public class Manager7 {

    static int test() {
        System.out.println("com.methodCall.Manager7.test()");
        return 95;
    }

    static int test1() {
        System.out.println("com.methodCall.Manager7.test()1");
        return 85;
    }

    static void test2() {
        System.out.println("com.methodCall.Manager7.test()2");

    }
    
    public static void main(String[] args) {
        System.out.println("com.methodCall.Manager7.main() begain");
        int j = 20 + test();
        test1();
        System.out.println("j :" + j);
        System.out.println("com.methodCall.Manager7.main() end");
        //System.out.print(test2());//parameter need
    }
}
