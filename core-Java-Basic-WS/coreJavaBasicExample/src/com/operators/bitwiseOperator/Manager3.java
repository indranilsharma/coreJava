/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operators.bitwiseOperator;

public class Manager3 {
	public static void main(String[] ses) {

		/*
		 * step 1: 1's compliment of that number (reverse the degit) 
		 * step 2: again 1's compliment of that result 
		 * step 3: add 1 to it
		 */

		int i = 1;
		i = ~i;
		System.out.println(i);// 2
	}
}
