package com.java8newfeature.common.streamApI;

abstract class DemoTest {
	int i;
	final int j;

	public DemoTest(int j) {
		//super();
		this.j = j;
	}

}

public class Test  extends DemoTest{

	public Test(int j) {
		super(j);
	}
	/*
	 * int i; int j;
	 *  public Test(int i, int j) 
	 * 	 * { //super(); 
	 * this.i = i; this.j =
	 * j; int k,l; k = i; l = j; System.out.println(k+" "+l); } public static
	 * void main(String[] args) { Test t = new Test(10, 20); //Test(10,20); }
	 */

}
