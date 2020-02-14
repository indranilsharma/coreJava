/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.constractor;

/**
 *
 * @author root
 */
public class Manager5 {

    public Manager5() {
        System.out.println("Manager5()");

    }
    public Manager5(int i,double d) {
        this(115);//curent clasc constractor with parameter
        System.out.println("Manager5(int i,double d)");

    }
    public Manager5(int i) {
        this();//curent clasc constractor 
        System.out.println("Manager5(int i)");
    }

    public static void main(String[] args) {
        Manager5 n = new Manager5();
        System.out.println("............");
        Manager5 n1 = new Manager5(110);
        System.out.println(".......");
        Manager5 n2 = new Manager5(110,4.7d);
        System.out.println(".......");

    }
}
