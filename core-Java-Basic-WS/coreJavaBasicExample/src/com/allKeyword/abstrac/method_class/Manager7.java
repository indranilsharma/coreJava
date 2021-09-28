/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.abstrac.method_class;

abstract class I {

    I(int i) {
        System.out.println("I(int i)");
    }

    abstract void test();
}

abstract class J extends I {

    J() {
        super(10);//total constastor signature must be implemented
        System.out.println("J()");
    }

}

class K extends J {

    K() {
        System.out.println("K()");
    }

    @Override
    void test() {
        System.out.println("test()");

    }
}

public class Manager7 extends J {

    Manager7() {
        System.out.println("Manager7()");
    }

    @Override
    void test() {
        System.out.println("test()");

    }

    public static void main(String[] args) {
        Manager7 m = new Manager7();
        m.test();
    }
}
