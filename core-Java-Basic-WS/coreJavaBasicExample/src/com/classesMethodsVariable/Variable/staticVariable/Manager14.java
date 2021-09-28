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
public class Manager14 {

    static int i;

    static {
        i = 20;
    }

    public static void main(String[] args) {
    	System.out.println(Manager14.i);//maintain single copy
        System.out.println("com.staticApp.Manager14.main() :" + i);
    }
}
