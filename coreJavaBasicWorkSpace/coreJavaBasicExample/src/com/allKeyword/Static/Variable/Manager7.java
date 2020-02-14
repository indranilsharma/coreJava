/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Variable;
/**
 *
 * @author root
 */
public class Manager7 {

    static int i = 10;
    static int j = i;
    static int x;
    static int y = x;
    static int z;
    static int res = x + z;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);

        System.out.println(x);
        System.out.println(y);
        
        System.out.println(res);
    }
}
