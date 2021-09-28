
package com.operators.assignmentOperator;

/**
 *
 * @author root
 */
public class Manager10 {
	public static void main(String args[]) {
		int a, b, c, d;
		a = b = c = d = 20;
		System.out.println("a="+a + " b =" + b + " c= " + c + " d= " + d);
		a += b -= c *= d /= 20;  //|a=a+b|b=b-c|c=c*d|d=d/20;
		System.out.println("a="+a + " b =" + b + " c= " + c + " d= " + d);//calculate from last

	}
}
