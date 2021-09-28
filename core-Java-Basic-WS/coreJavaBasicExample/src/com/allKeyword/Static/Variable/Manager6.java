/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Variable;

public class Manager6 {
	static int i = 10;

	public static void main(String[] args) {
		System.out.println(i);//refaring the staic bcz not initilised
		int i = 2; //local
		System.out.println(i);
		System.out.println(Manager6.i);
	}
}
