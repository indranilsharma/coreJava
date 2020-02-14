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
public class Manager3 {

    public Manager3() {
        System.out.println("default()");
    }

    public Manager3(int i) {
        System.out.println("Manager3(int i)");
    }

    public static void main(String[] args) {
        Manager3 m = new Manager3();
        System.out.println(".....................");
        Manager3 m1 = new Manager3(200);
        System.out.println(".....................");
        Manager3 m2 = new Manager3();
        System.out.println(".....................");
        Manager3 m3 = new Manager3(400);

    }
}
