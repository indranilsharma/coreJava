package com.classesMethodsVariable.Variable.staticVariable;
/**
 *
 * @author root
 */
public class Manager5 {

    static int i = 10;
    static int j;
    static int k ;
    static  int m;

    public static void main(String[] args) {
        int i = 20;
        System.out.println("local i:" + i);
        System.out.println("static i:" + Manager5.i);
        System.out.println("static j:" + j);//used before initilised
        Manager5.j = 1000;
        System.out.println("local.j  :" + j);

        System.out.println("static"+k);////used before initilised
        k = 88;
        System.out.println("local "+k);
        System.out.println("static "+ Manager5.k);//already override maintain single copy
  
        System.out.println(m);// i and i diffarent 
        int m = 4488;//m and local m are diffrent 
        System.out.println(m);
        System.out.println(Manager5.m);//m and local m are diffrent 

    }

}
