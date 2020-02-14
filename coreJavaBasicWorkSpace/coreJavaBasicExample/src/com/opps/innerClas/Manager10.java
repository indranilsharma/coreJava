package com.opps.innerClas;

class A10 {
	/*
	 * abstract void test1(); { System.out.println("test()"); }
	 * 
	 * abstract void test2(); { System.out.println("test()"); }
	 */

	void test1()

	{
		System.out.println("test()");
	}

	void test2()

	{
		System.out.println("test()");
	}
}

public class Manager10 {

public static void main(String[] args) {
	
	A10 a10 = new A10()
	
	{
	    	void test3() {
			System.out.println("test3()");
		}
	};
	
	a10.test1();
	a10.test2();
	System.out.println("done");
}
}
