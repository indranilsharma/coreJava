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
public class Manager14 {

    static int test(int i) {
        return i--;
    }

    static int test1(int k) {
        return ++k;
    }

    public static void main(String[] args) {
        int i = 10;
        int j = i++ + i + test(i++) + ++i + test(++i) + --i + test(--i) + i + ++i;
        System.out.println("i :" + i);
        System.out.println("j :" + j);
        System.out.println("........................");
        int l=i++ + i + test(i++) + ++i + test(++i) + --i + test(--i)+test1(i)+test1(i++) + ++i + test1(++i);
        System.out.println("l :"+l);
    }
}
