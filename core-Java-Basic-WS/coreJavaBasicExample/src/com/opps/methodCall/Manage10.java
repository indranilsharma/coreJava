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
public class Manage10 {
    static void test(boolean  b,int i) {
        System.out.println(i);
        System.out.println(b);
        System.out.println("test()");
    }
    static void test1(double d,char  c,String s) {
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("com.methodCall.Manage10.main()");
        test(true, 10);
        boolean f=false;
        test(f, 77700);
        test1(0.2,'I',"india");
        System.out.println("com.methodCall.Manage10.main() end");
    }
}
