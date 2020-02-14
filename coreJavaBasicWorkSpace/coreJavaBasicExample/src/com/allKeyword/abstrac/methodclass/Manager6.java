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
abstract class G {

    static int i = 10;

    abstract void test();

    abstract void test1();

    static 
    {
        System.out.println("SIB G static :");
    }

//    {
//        System.out.println("IIB G");//unless you create object IIB non initiate and this abstract 
//    }

    static void printStatic() {
        System.out.println("Static1()");
    }

    void test2() {
        System.out.println("non-Static1()");

    }
}

abstract class H extends G {

    void test() {
        System.out.println("test() implemented at H");
    }
}

public class Manager6 extends H {

    @Override
    void test1() {
        System.out.println("test1() implemented at H");
    }

    public static void main(String[] args) {
        Manager6 m = new Manager6();
        m.test();
        m.test1();
        m.test2();
        System.out.println(m.i);
        printStatic();
       
    }
}
