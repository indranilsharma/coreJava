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
public class Manager9 {

    static void test(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        test(100);
        int k = 200;
        test(k);
        test(k + 300);
        int m;
        //test(m);//should be assign
        test(m=2055);
        
        System.out.println("done");
        test2(1555, k);
    }
    static void test2(int i,int j) {
        System.out.println(" i:"+i+" j:"+j);
    }
}
