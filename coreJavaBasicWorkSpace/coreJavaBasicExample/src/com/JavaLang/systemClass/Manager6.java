package com.JavaLang.systemClass;

/* Terminates the currently running Java Virtual Machine. The
*  argument serves as a status code

  @param      status   exit status.
* @throws  SecurityException
*        if a security manager exists and its <code>checkExit</code>
*        method doesn't allow exit with the specified status.
* 
* @see        java.lang.Runtime#exit(int)
*
                                 public static void exit(int status) {
                                 Runtime.getRuntime().exit(status);
}*/

public class Manager6 {
public static void main(String[] args) {
	System.exit(4);
}
}
