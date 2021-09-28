/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allKeyword.Static.Variable;

public class Manager5 {

	static int i = 10;
	static int j;
	static int k;
	static int m;

	public static void main(String[] args) {
		int i = 20;
		System.out.println("i:" + i);
		System.out.println("i:" + Manager5.i);//reffaring static
		System.out.println("j:" + j);
		Manager5.j = 1000;
		System.out.println("Manager5.j :" + j);

		System.out.println(k);// i and i different
		k = 88;
		System.out.println(k);
		System.out.println(Manager5.k);//reffaring static

		System.out.println(m);// i and i diffarent
		int m = 4488;// m and local m are diffrent
		System.out.println(m);
		System.out.println(Manager5.m);
	}

}
