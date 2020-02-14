package com.opps.Interfaces;

interface X {
	void test1();
}

interface Y {
	void test2();
}

class Z {
	void test3() {
		System.out.println("test3()");
	}
}

public class Manager5 extends Z implements X, Y {

	@Override
	public void test2() {
		System.out.println("test2())");

	}

	@Override
	public void test1() {
		System.out.println("test1()");

	}

	public static void main(String[] args) {
		Manager5 m = new Manager5();
		m.test1();
		m.test2();
		m.test3();
		System.out.println("done");
	}
}
