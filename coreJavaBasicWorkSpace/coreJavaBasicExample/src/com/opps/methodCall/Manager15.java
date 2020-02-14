/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.methodCall;

/**
 *
 * @author root
 */
public class Manager15 {

    static int test1(int i) {
        return test2(i++)+test2(++i);
    }

    static int test2(int i) {
        return test3(i--)+test3(--i);
    }
    
    static int test3(int i) {
        return i++ + ++i +i;
    }
    public static void main(String[] args) {
        int i;
        i=test1(i=0);
        System.out.println("i :"+i);
        i=test2(i=0);
        System.out.println("i :"+i);
        i=test1(i=0);
        System.out.println("i :"+i);
    }
}
