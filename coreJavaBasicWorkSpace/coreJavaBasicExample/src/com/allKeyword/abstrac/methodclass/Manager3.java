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
abstract class C {

    abstract void test();

    abstract void test1();

    void print() {
        System.out.println("print()");
    }

}

abstract class D extends C {

    @Override
    void test() {
        System.out.println("test() implemented at D");
    }
}

public class Manager3 extends D {

    @Override
    void test1() {
        System.out.println("test1() implemented at Manager3");

    }

    public static void main(String[] args) {
        Manager3 m = new Manager3();
        m.test();
        m.test1();
        m.print();
    }

}
