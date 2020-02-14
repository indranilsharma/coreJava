package com.operators.assignmentOperator;

/**
 *
 * @author root
 */
public class Manager6 {
    public static void main(String[] argv){
        String s = "123";
        s += "45";
        s += 67;
        System.out.println(s);//1234567
    
        int b = 2;
        System.out.println("" + b + 3);//"" represent string so all are treat as a string
    }
}
