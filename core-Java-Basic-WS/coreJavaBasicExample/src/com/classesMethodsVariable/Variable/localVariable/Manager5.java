package com.classesMethodsVariable.Variable.localVariable;

/*
Attempt to use a loop variable outside the code block of the loop
*/
public class Manager5 {

	public static void main(String[] argv) {
		System.out.println();
	}

	public static int findNdx(String name) {
		for (int i = 0; i < 3; i++) {
			if (i == 2)
				break;
		}
		// return i; //can't be a variable.
		return 1;
	}
}
