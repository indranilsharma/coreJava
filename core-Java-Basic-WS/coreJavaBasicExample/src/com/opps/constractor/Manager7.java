/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.constractor;

public class Manager7 {

	static {
		System.out.println("SIB 1");
	}

	static {
		System.out.println("SIB 2");
	}

	public Manager7() {
		// this(10);//one to other
		System.out.println("M()");

	}

	public Manager7(int i) {
		this();
		System.out.println("M(int i)");
	}

	public static void main(String[] args) {
		new Manager7();
		System.out.println("..........");
		new Manager7(10);
		System.out.println(".........");
	}
}
