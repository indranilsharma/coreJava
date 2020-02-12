package com.deepak.test;

public class Test1 {

	static void A()
	{
		System.out.println("hello");
	}
	private static void  B()
	{
		A();
	}
	public static void main(String[] args) {
	Test1 test = new Test1();
	
         test.B();
	}

}
