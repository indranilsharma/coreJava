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
abstract class B {

    abstract void test1();

    abstract void test2();

    abstract void test3();

}

public class Manager2 extends B{

    @Override
    void test1() {
        System.out.println("test1() implemented");
    }

    @Override
    void test2() {
        System.out.println("test2() implemented");
    }

    @Override
    void test3() {
        System.out.println("test3() implemented");
    }
    public static void main(String[] args) {
        Manager2 m=new Manager2();
        m.test1();
        m.test2();
        m.test3();
    }
}
