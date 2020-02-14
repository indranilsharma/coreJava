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
public class Manager4 {

    public Manager4() {
        System.out.println("Manager4()");
    }

    public Manager4(int i, double d) {
        System.out.println("Manager4(int i, double d)");
        System.out.println(" " + i + "," + d);

    }

    public Manager4(double d, float f) {
        System.out.println("Manager4(double d, float f)");
        System.out.println(" " + d + "," + f);

    }

    public Manager4(boolean b, char c) {
        System.out.println("Manager4(boolean b)");
        System.out.println(" " + b + "," + c);

    }

    public Manager4(String s) {
        System.out.println("Manager4(String s)");

    }

    public static void main(String[] args) {
        Manager4 m = new Manager4();
        Manager4 m1 = new Manager4(7, 4.5);
        Manager4 m2 = new Manager4(7.008, 2.02f);
        Manager4 m3 = new Manager4(true, 'I');

    }
}
