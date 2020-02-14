/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.abstrac.methodclass;

/**
 *
 * @author root
 */
abstract class E {

    abstract void test();

    abstract void test1();

    abstract void test2();

    abstract void test3();

}

abstract class F extends E {

    void test() {
        System.out.println("test()");
    }
}

public class Manager4 extends F {

    @Override
    void test1() {
        System.out.println("test1()");
    }

    @Override
    void test2() {
        System.out.println("test2()");
    }

    @Override
    void test3() {
        System.out.println("test3()");
    }

    void own() {
        System.out.println("own()");
    }

    public static void main(String[] args) {
        Manager4 m = new Manager4();
        m.test();
        m.test1();
        m.test2();
        m.test3();
        m.own();

    }
}
