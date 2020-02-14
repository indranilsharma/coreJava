/*
Expression x && y is evaluated in the following manner:
1. Evaluate x.
2. If x is false, return false.
3. Otherwise, if x is true evaluate y.
4. Return the value of y.
The expression x || y is evaluated as follows:
1. Evaluate x.
2. If x is true return true.
3. Otherwise, if x is false evaluate y.
4. Return the value of y.
*/
package com.operators.booleanOperators;

/**
A         B             A|B       A&B      A^B      !A
false     false         false     false    false    true
true      false         true      false    true     false
false     true          true      false    true     true
true      true          true      true     false    false
 */
public class Maanger2 {
    static boolean secondPart(boolean b) {
  System.out.print("secondPart! ");
  return b;
 }
 public static void main(String args[]) {
  boolean t = true;
  boolean f = false;
  System.out.println(false & secondPart(true)); //false
  System.out.println(false && secondPart(true)); //false
  System.out.println(true | secondPart(true)); //true
  System.out.println(true || secondPart(true));//true
 }
}
