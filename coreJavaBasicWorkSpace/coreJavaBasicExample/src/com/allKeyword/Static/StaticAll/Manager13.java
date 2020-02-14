/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.StaticAll;

/**
 *
 * @author root
 */
public class Manager13 {

    static int i = test();

    static {
        System.out.println("SIB start");
        main(null);
        System.out.println("SIB end");
    }

    static int test() {
        System.out.println("test() start");
        main(null);
        System.out.println("test() end");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("main()" + i);
    }
}
