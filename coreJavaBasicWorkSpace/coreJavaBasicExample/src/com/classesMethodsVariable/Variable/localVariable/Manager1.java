package com.classesMethodsVariable.Variable.localVariable;

/*Local variables are variables declared within a method. 
Local variable declarations can't use public 
(or the other access modifiers), transient, volatile, abstract, or static
A local variable must be initialized before you try to use it. */

public class Manager1 {
	public static void main(String[] argv) {
		int i = 0; //should be initilized
		System.out.println(i);

	}
}
