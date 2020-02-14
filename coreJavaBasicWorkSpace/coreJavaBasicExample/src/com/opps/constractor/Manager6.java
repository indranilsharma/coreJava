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
class Manager6 {

    Manager6() {
        System.out.println("Manager6()");

    }

    Manager6(int i) {
        this();////current class costractor but this() should be first statement
        Manager6 m=new Manager6();//current class costractor
        new Manager6();//current class costractor
        System.out.println("Manager6(int i)");

    }

    Manager6(int i, int j) {
    }

    public static void main(String[] args) {
        Manager6 m = new Manager6();
        System.out.println("...........");
        Manager6 m1 = new Manager6(10);
        System.out.println("...........");
    }

    
}
