/*
 | short-circuit OR

&& and || are similar to the & and | operators.
&& and || are applicable only to boolean values and not integral types. 
&& and || have the ability to "short circuit" a calculation if the result is definitely known. 
&& and || are useful for null-reference-handling in Java programming. 
The right operand might not be evaluated in the && and || 
*/
package com.operators.booleanOperators;

/**
A         B             A|B       A&B      A^B      !A
false     false         false     false    false    true
true      false         true      false    true     false
false     true          true      false    true     true
true      true          true      true     false    false
 */
public class Manager1 {
    public static void main(String[] args) {
      if ((isItSmall(3)) || (isItSmall(7))) { //(false||true) true
        System.out.println("Result is true");
      }
      if ((isItSmall(6)) || (isItSmall(9))) {//(false||false) false
        System.out.println("Result is true");
      }
   }

   public static boolean isItSmall(int i) {
     if (i < 5) {
       System.out.println("i < 5");
       return true;
     } else {
       System.out.println("i >= 5");
       return false;
     }
   }
}
