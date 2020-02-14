/*

 * float and double use 32 and 64 bits, respectively. 
Float literals end in F or f, double literals end in a digit or D or d.
Floating-point numbers are implicitly doubles (64 bits).

A floating-point literal with letter E or e (scientific notation)
A floating-point literal with suffix F or f, indicating a float literal
 */
package com.datatype.Literal.floatingLiteral;

/**
 *
 * @author root
 */
public class Manager9 {
    public static void main(String[] argv){
    double myDouble;
    float myFloat;
    
    myDouble  = 1.1;
    myFloat  = 1.2F; // F stands for float
    float aFloatValue = 1.414F; 
    float atFloatValue = 4.3E+2F;
    float a= 1.828f;
    System.out.println(atFloatValue);
    System.out.println(aFloatValue);
    System.out.println(a);

    
  }
}
