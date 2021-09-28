/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Variable;

class A {

	/*
	 * When a variable is declared as static, then a single copy of variable is
	 * created and shared among all objects at class level. Static variables
	 * are, essentially, global variables
	 * 
	 * Static local variables are not allowed
	 */

	static int i;
}

class B {
	static {
		System.out.println("B static block"); // not called bcz not enter
	}
}

public class Manager15 {

	public static void main(String[] args) {

		// “Static local variables are not allowed”
		// static int i ;

		System.out.println(A.i);
	}
}
