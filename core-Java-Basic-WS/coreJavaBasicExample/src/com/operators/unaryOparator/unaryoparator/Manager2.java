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
public class Manager2 {
    public static void main(String[] args) {
        int x=0;
        int y= x-- + x + x + x-- + x++;
        int i=1;
        int j=i--;
        int k=i++ + j++ + --j + i++ + --i; //
        System.out.println("x :"+x);//-1
        System.out.println("y :"+y);//-5
        System.out.println("k :"+k);//4
    }
}
