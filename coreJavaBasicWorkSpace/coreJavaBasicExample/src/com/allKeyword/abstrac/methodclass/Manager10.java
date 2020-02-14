package com.allKeyword.abstrac.methodclass;

abstract class Manager11 {

	abstract void test1();

	abstract void test2();

	abstract void test3();
}

class Manager10 extends Manager11 {

	void test1() {
		System.out.println("test1()");
	}

	void test2() {
		System.out.println("test2()");
	}

	void test3() {
		System.out.println("test3()");
	}

	public static void main(String[] args) {
		System.out.println();
		Manager10 obj = new Manager10();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
