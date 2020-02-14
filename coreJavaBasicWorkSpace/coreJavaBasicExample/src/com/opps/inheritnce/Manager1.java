/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.inheritnce;

/**
 *
 * @author root
 */
class A {

    static int i;

    public void test() {
        System.out.println("test()");
    }

    public static void test1() {
        System.out.println("test1()");
    }

}

public class Manager1 extends A {

    int j;

    public static void main(String[] args) {
        System.out.println("............");
        test1();// if remove extends then A.test1() you need do that
        System.out.println("............");
        Manager1 m = new Manager1();
        System.out.println("............");
        m.test();
        System.out.println(m.j);
        System.out.println("............");
        System.out.println(i);

    }
}
