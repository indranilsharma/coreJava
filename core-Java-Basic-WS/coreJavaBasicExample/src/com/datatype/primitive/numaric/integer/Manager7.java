/*
 * 2 times error will print
    The local variable i may not have been initialized
	The local variable i may not have been initialized

 */
package com.datatype.primitive.numaric.integer;

/**
 *
 * @author root
 */
public class Manager7 {
    public static void main(String[] args) {
        int i;
        int x=88;
        double d=99;
        //int j=i;//local variable not initilasied
        //  System.out.println(i);//local variable not assign
       // i++;//can't incremented 
       //double i=50.2;//duplicate local variable
        System.out.println(i=10);//different
        System.out.println("x:"+i+" d:"+d);
        
    }
}