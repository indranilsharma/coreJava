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
public class Manager5 {

    int i;
    static  int j; 
    public static void main(String[] args) {
        Manager5 m = new Manager5();
        System.out.println(m.i);
        Manager5 m1 = new Manager5();
        System.out.println(m1.i);
        m.i = 100;
        m1.i = 200;
        System.out.println("static i:"+j+" non static way "+m.j);
        System.out.println("m.i: " + m.i + " m1.i: " + m1.i);
    }

}
