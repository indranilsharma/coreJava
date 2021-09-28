/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;

public class Manager10 {

	/*
	 * Any static member can be accessed before any objects of its class are
	 * created, and without reference to any object
	 * 
	 * They can only directly call other static methods. They can only directly
	 * access static data. They cannot refer to this or super in any way.
	 */

	static int i = 10;
	static int j = test1();

	static int test1() {
		return i;// 10
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
	}
}
