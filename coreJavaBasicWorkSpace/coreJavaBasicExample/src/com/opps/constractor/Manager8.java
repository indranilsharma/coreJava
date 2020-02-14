/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.constractor;

/**
 *
 * @author root
 */
public class Manager8 {

    static {
        System.out.println("SIB 1");
        Manager8 n = new Manager8();
        System.out.println("SIB 1");

    }

    public Manager8() {
        System.out.println("M()");

    }

    public static void main(String[] args) {

        System.out.println("............");
        Manager8 n = new Manager8();
        System.out.println(".......");

    }
}
