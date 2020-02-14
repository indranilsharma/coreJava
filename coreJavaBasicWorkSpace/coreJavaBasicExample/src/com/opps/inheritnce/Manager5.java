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
class I {

    public I() {
        //this(10);
        System.out.println("I()");
    }

    {
        System.out.println("I IIB 1");
    }

    static {
        System.out.println("I SIB");
    }

    I(int i) {
         this();
        System.out.println("I(int i)");
    }
}

class K extends I {

    public K() {
        this(10);
        System.out.println("K()");
    }

    {
        System.out.println("K IIB 1");
    }

    static {
        System.out.println("K SIB");
    }

    K(int i) {
        super(i);
        System.out.println("K(int i)");
    }

    {
        System.out.println("K IIB 2");
    }
}

class L extends K {

    public L() {
        this(10);
        System.out.println("K()");
    }

    {
        System.out.println("K IIB 1");
    }

    static {
        System.out.println("K SIB");
    }

    L(int i) {
        super(90);
        System.out.println("K(int i)");
    }

    {
        System.out.println("K IIB 2");
    }
}

public class Manager5 {

    static {
        System.out.println("Manager5 SIB 2");
    }

    public static void main(String[] args) {
        new I();
        new K();
        new L();
        new I(20);
        new K(40);
        new L(80);
    }
}
