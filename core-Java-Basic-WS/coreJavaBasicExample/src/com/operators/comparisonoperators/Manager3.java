
package com.operators.comparisonoperators;
/*
Java promotes the smaller type to the larger type; 
char value A (represented by the Unicode value 65) is promoted to a float 65.0F. 
The comparison is then performed on the resulting float values.
 */
public class Manager3 {

    public static void main(String[] argv) {
        char a = 'A';
        float f = 100.11F;
        if (a < f) {//inbetween the convert to 65.0f
            System.out.println("a > f");
        }
        else {
			System.out.println("else");
		}

    }
}
