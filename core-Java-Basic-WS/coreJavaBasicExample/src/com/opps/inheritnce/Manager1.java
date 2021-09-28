package com.opps.inheritnce;

class A {

	static int i;//compiler will assign value

	public void test() {
		System.out.println("test()");
	}

	public static void test1() {
		System.out.println("test1()");
	}
}

public class Manager1 extends A {
	
	int j;//compiler will assign value

	public static void main(String[] args) {
		System.out.println("............");
		test1();// static THAT IS WHY WE can access without obj
		System.out.println("............");
		Manager1 m = new Manager1(); 
		System.out.println("............");
		m.test();
		System.out.println(m.j);
		System.out.println("............");
		System.out.println(i);//static
	}
}
