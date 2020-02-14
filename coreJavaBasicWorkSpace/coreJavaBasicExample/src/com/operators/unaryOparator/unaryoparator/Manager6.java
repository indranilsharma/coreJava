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
public class Manager6 {

    public static void main(String[] argv) {
        int x = 2;
        int y = 3;
        if ((y == x++) | (x < ++y)) {
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
