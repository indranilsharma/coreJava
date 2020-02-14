/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.memoryCollection.staticMemory;

/**
 *
 * @author root
 */
public class Manager6 {

    int i;

    static void test1(int i) {
        System.out.println("static test1()" + i);
        i = 100;
    }

    static void test2(Manager6 m) {

        System.out.println("non-static test1()" + m);
        m.i = 200;
    }

    public static void main(String[] args) {
        System.out.println("main()");
        Manager6 m = new Manager6();
        m.i = 300;
        System.out.println("m.i :" + m.i);
        test1(m.i);
        System.out.println("m.i :" + m.i);
        test2(m);
        System.out.println("m.i :" + m.i);

    }
}
