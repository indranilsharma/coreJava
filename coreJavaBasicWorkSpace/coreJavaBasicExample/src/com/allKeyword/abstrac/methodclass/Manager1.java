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
abstract class A {

    public abstract void test();

    void test2() {
        System.out.println("test1()");
    }
}

public class Manager1 extends A {

    public void test() {
        System.out.println("test() implemented");
    }

    public static void main(String[] arg) {
        Manager1 m = new Manager1();
        m.test();
        m.test2();
        System.out.println("main()");
    }

}
