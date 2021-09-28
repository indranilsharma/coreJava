
package com.operators.booleanOperators;

/**
 * Java does not permit you to cast any type to boolean
A         B             A|B       A&B      A^B      !A
false     false         false     false    false    true
true      false         true      false    true     false
false     true          true      false    true     true
true      true          true      true     false    false
 */
public class Manager4 {
    public static void main(String[] argv) {
    int i = 0;
    boolean b = true;
  //The operator & is undefined for the argument type(s) int, boolean
    /*if (i & b) {
      System.out.println("true");
    }*/
  }
}
