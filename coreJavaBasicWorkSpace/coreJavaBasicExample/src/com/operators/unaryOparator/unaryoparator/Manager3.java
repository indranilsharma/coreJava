/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.unaryOparator.unaryoparator;

/**
 *
 * @author root
 */
public class Manager3 {
    public static void main(String[] args) {
        int i=0;
        int k=0;
        k= --k;
        int j=--i + ++i + i++ + i++;
        System.out.println("i :"+i);
        System.out.println("j :"+j);
        System.out.println("k :"+k);
    }
}
