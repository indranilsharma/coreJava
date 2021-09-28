
package com.operators.arithmaticOperators;

/*
Size:
4 byte ( 32 bits )

Values:
upto 7 decimal digits

Default Value:
0.0

*/

public class Manager6 {
    public static void main(String[] argv){
        float f = 0.0F;
        float f1 = 1.1F;       
        System.out.println(Float.isInfinite(f1/f));//true
    }
}
