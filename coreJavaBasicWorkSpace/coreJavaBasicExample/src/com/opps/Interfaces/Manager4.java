package com.opps.Interfaces;

interface N {
	void test1();
}

interface M {
	void test2();
}

interface O {
	void test3();
}

public class Manager4 implements M, N, O {

	@Override
	public void test1() {
		System.out.println("test1()");
	}

	@Override
	public void test2() {
		System.out.println("test2()");

	}

	@Override
	public void test3() {
		System.out.println("test3()");

	}
public static void main(String[] args) {
	Manager4 m=new Manager4();
	m.test1();
	m.test2();
	m.test3();
	System.out.println("done");
}
}
