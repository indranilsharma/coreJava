/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero*/
package com.operators.arithmaticOperators;

/**
 *
 * @author root
 */
public class Manager2 {
    public static void main(String[] argv){
       double i = 9;
       double j = 0;
       double z = i/j;//arithmetic exception
       System.out.println(z);

       int i1 = 9;
       int j1 = 0;
       int z1 = i1/j1;//arithmetic exception
       System.out.println(z1);
       
       
       

    }
}
