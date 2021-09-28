/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classesMethodsVariable.Variable.staticVariable;

/**
 *
 * @author root
 */
public class Maanger2 {

    static int i;//default value 0 for int
    static int j;//default value 0 for int
    static int x, y, z = 79, m = 100;
    static double x1, y1, m1 = 10.90;//default value 0.0 for double

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
        i = 20;
        j = 50;
        System.out.println(i);
        System.out.println(j);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(m);
        
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(m1);
    }
}
