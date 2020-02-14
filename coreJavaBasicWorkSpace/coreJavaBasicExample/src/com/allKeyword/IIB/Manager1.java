/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.IIB;

/**
 *
 * @author root
 */
public class Manager1 {

    static byte b;

    public Manager1(boolean b, int i) {
        this();
        System.out.println(Manager1.b);
        System.out.println("M(boolean b,int i)" + b + "," + i);
    }

    public Manager1() {
        System.out.println(Manager1.b);
        System.out.println(b);
        System.out.println("M()");

    }

    public Manager1(float f, String s) {
        this(false, 200);
        System.out.println(b);

        System.out.println("M(float f,String s)" + f + "," + s);

    }

    static {
        System.out.println("SIB 1");
    }

    static {
        System.out.println("SIB 2");
    }

    {
        System.out.println("IIB 1");
    }

    {
        System.out.println("IIB 2");
    }

    public static void main(String[] args) {
        Manager1 m = new Manager1();
        System.out.println("...............");
        Manager1 m1 = new Manager1(true, 100);
        System.out.println("...............");
        Manager1 m2 = new Manager1(100.2f, "india");
        System.out.println("...............");

    }
}
