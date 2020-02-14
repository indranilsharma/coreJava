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
class D {

    D() {
        System.out.println("D()");
    }
}

class E extends D {

    E() {
        System.out.println("E()");
    }
}

public class Manager3 {

    public static void main(String[] args) {
        D d = new D();
        System.out.println("..........");
        E e = new E();
        System.out.println("...........");
    }
}
