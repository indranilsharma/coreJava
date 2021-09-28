/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Method;

public class Manager3 {

	//prefarence SIB first
	static int i;
	
	static {
		System.out.println("SIB-block");
	}

	static void test() {
		System.out.println("test()" + i);
	}

	public static void main(String[] args) {
		System.out.println("main()");
		i = 20;
		test();
	}
}
