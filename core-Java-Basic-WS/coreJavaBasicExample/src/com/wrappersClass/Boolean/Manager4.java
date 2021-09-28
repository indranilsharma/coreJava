package com.wrappersClass.Boolean;

/*
Parses the string argument as a boolean.  The {@code boolean}
* returned represents the value {@code true} if the string argument
* is not {@code null} and is equal, ignoring case, to the string
* {@code "true"}.*/



/*  parseBoolean() Parses the string argument as a boolean. The boolean
 *  returned represents the value true if the string argument is not null 
 *  and is equal, ignoring case, to the string “true”.
    Example: Boolean.parseBoolean(“True”) returns true.
    Example: Boolean.parseBoolean(“yes”) returns false.  as this method is
    likely to yield significantly better space and time.
 */

public class Manager4 {
    
	public static void main(String args[]) {

        String str = "true false";
        boolean x = Boolean.parseBoolean(str);
        System.out.print(x);

    }
}
