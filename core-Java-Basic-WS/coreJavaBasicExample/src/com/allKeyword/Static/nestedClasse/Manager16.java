/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.nestedClasse;

/**
 *
 * @author root
 */
class C {

    static int i = 10;

    static {
        System.out.println("c SIB");
    }
}

class D {

    static {
        System.out.println("D SIB");
    }
    public static void main(String[] args) {
        System.out.println("D.main()");
    }
}
public class Manager16 {

    static {
        System.out.println("Manager16 SIB");
    }

    public static void main(String[] args) {
        System.out.println("com.staticApp.Manager16.main() start");
        System.out.println(C.i);
        System.out.println("com.staticApp.Manager16.main()");
    }
}
