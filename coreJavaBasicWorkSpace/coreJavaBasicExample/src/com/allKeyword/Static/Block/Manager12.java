/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Block;

/**
 *
 * @author root
 */
public class Manager12 {

    static {
        System.out.println("SIB-1");
    }

    public static void main(String[] args) {
        System.out.println("com.staticApp.Manager12.main()");
    }

    static {
        System.out.println("SIB-2");
    }
}
