package com.JavaLang.roundingFunctions;

/*@param   a   a value.
* @return  the largest (closest to positive infinity)
*          floating-point value that less than or equal to the argument
*          and is equal to a mathematical integer.
*
public static double floor(double a) {
   return StrictMath.floor(a); // default impl. delegates to StrictMath
 }
*/


public class Manager4 {
    public static void main(String args[]) {

        double x = 3.14;  

        int y = (int) Math.floor(x);

        System.out.print(y);

   }
}
