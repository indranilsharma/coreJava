
package com.operators.bitwiseOperator;

/**
 *The shift operators, >>, >>>, and << work with integer primitives only; 
The >> right shift extends the sign so a negative number stays negative
The >>> operator shifts in zero bits, creating a positive number. 
The << left shift always shifts in zero bits at the least significant position.
 *
 * Shifts the bits of the number to the right and fills 0
 *  on voids left as a result. The leftmost bit depends on the sign of initial number
 */
public class Manager2 {
    public static void main(String[] argv){
        System.out.println(3 << 2);//12
        System.out.println(-6 >> 2); //1   
        System.out.println(-6 >>> 2);    
    }
}
