package com.opps.constractor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author root
 */
public class Manager1 {

    public Manager1() {
        System.out.println("Manager1()");
    }

    public static void main(String[] args) {
        new Manager1();
        Manager1 m = new Manager1();//both are same
        System.out.println("..........");

        new Manager1();
        Manager1 m1 = new Manager1();

        System.out.println("..........");
    }

}
