package com.opps.innerClas;
//this the normal approch to Manager10

class A9 {
	void test1() {
		System.out.println("A9-test1");
	}

	void test2() {
		System.out.println("A9-test2");
	}
}

abstract class B9 {
	abstract void test3();

	void test2() {
		System.out.println("A9-test2");
	}
}

interface C9 {
	void test1();

	void test2();
}

public class Manager9 {
	public static void main(String[] args) {
		A9 a9 = new A9();
		a9.test1();
		a9.test2();
	}
}
