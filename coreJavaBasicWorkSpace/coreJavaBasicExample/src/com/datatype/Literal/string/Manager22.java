/*
 ava does not deal with strings as arrays of bytes, but as objects
 */
package com.datatype.Literal.string;

/**
 *
 * @author root
 */
public class Manager22 {
    public static void main(String[] argv) {
    String name = ""; // an empty string, but still an object
    String type = ".TXT";
    String longtxt = "A great long bunch of text \n" + "to illustrate how you break long lines.";
    System.out.println(name);
    System.out.println(type);
    System.out.println(longtxt);

  }
}
