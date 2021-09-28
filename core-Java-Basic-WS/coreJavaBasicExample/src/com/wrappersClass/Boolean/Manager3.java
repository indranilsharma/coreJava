package com.wrappersClass.Boolean;


/*  valueOf() returns a Boolean instance representing the specified boolean value.
 *  If the specified boolean value is true, this method returns Boolean.TRUE; if it is false, 
 *  this method returns Boolean.FALSE. If a new Boolean instance is not required,
 *   this method should generally be used in preference to the constructor Boolean(boolean),
 *  as this method is likely to yield significantly better space and time.
 */

public class Manager3 {
    public static void main(String args[]) {

        String str = "TRUE";
        boolean x = Boolean.valueOf(str);
        System.out.print(x);

    }
}
