/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.booleanOperators;

/**
A         B             A|B       A&B      A^B      !A
false     false         false     false    false    true
true      false         true      false    true     false
false     true          true      false    true     true
true      true          true      true     false    false
 */
public class Manager5 {
  public static void main(String[] argv) {
    int val = (int) (2 * Math.random());
    boolean test = (val == 0) | (++val == 2);
    System.out.println("test = " + test + "\nval = " + val);
  }  
}
