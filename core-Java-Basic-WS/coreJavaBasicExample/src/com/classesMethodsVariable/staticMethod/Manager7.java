/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classesMethodsVariable.staticMethod;

/**
 *
 * @author root
 */
public class Manager7 {

    int i;

    static Manager7 test() {
        Manager7 m1 = new Manager7();
        m1.i=200;
        return m1;
    }

    public static void main(String[] args) {
        Manager7 m2 = test();
        System.out.println("m2.i :" + m2.i);
        Manager4.test1(44);
    }
}
