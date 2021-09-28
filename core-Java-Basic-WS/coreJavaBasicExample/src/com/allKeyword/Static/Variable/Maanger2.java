/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Variable;

public class Maanger2 {

    static int i;
    static int j;
    static int x, y, z = 79, m = 100;
    static double x1, y1, m1 = 10.90;

    public static void main(String[] args) {
        System.out.println(i);//default value JVM provide
        System.out.println(j);//default value JVM provide
        i = 20;//override
        j = 50;//override
        System.out.println(i);
        System.out.println(j);

        System.out.println(x);//default value JVM provide
        System.out.println(y);//default value JVM provide
        System.out.println(z);
        System.out.println(m);
        
        System.out.println(x1);//default value JVM provide float 0.0
        System.out.println(y1);//default value JVM provide float 0.0
        System.out.println(m1);
    }
}
