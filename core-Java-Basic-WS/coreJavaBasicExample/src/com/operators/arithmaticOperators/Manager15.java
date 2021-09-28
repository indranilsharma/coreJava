package com.operators.arithmaticOperators;

/**
 *
 *  non-String operand is converted to a String before
 *   the concatenation takes place       
 */
public class Manager15 {

    public static void main(String[] argv) {
        String a = "a";
        int b = 1;
        //non-String operand is converted to a String before the concatenation takes place       
        String c = a + b;
        System.out.println(c);

    }
}
