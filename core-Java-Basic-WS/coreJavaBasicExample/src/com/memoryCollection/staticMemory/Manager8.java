/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.memoryCollection.staticMemory;

/**
 *
 * transfer the value through object
 */
public class Manager8 {

    int i;

    static Manager8 test(Manager8 m) {
        Manager8 m2 = new Manager8();
        m2.i=m.i;
        return m2;
    }

    public static void main(String[] args) {
        Manager8 m = new Manager8();
        m.i = 200;
        Manager8 m3=test(m);
        System.out.println(m3.i);
    }
}
