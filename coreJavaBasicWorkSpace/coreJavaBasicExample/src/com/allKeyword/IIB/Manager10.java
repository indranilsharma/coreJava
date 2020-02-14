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
public class Manager10 {

    static int i;

    static {
        System.out.println(i);
        System.out.println("static");
    }

    static void test() {
        System.out.println(i);

        System.out.println("test()");
    }

    {
        System.out.println(i);
        System.out.println("IIB");
    }

    public static void main(String[] args) {
        new Manager10();//pre object creation
        Manager10 m = new Manager10();
        System.out.println(m.getClass());
        System.out.println(m.hashCode());
        test();//static method no need object creation
        System.out.println(i);

    }
}
