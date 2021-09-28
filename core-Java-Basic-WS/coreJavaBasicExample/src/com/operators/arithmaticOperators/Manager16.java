/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.arithmaticOperators;

/**
 *
 * @author root
 */
public class Manager16 {
    public static void main(String[] argv){

       String a = "a :";
       MyClass b = new MyClass();//returning value store in object

       String c = a + b;
       System.out.println(c);

    }
}
    
class MyClass{
   public String toString(){
      return "my class";
   }
}
