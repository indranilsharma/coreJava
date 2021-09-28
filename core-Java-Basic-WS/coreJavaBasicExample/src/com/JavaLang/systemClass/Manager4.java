package com.JavaLang.systemClass;

/*here we mention what to copy and from where to copy*/


public class Manager4 {
    public static void main(String args[]) {

        byte a[] = { 65, 66, 67, 68, 69, 70 };
        byte b[] = { 71, 72, 73, 74, 75, 76 };  
        System.arraycopy(a, 2, b, 3, a.length - 4);
        System.out.print(new String(a) + " " + new String(b));

    }
}
