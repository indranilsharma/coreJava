/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classesMethodsVariable.staticMethod;

/**
 *
 * @author root
 */
public class Manager4 {

    static int test1(int i) {
        System.out.println("static test1()" + i);
        return i;
    }

    int test2(int i) {
        
            System.out.println("non-static test1()" + i);
            return i;
        }
       public static void main(String[] args) {
           System.out.println("main()");
           Manager4 m=new Manager4();
           test1(4);
           m.test1(8);//static using like non static
           m.test2(7);
    }
    }
