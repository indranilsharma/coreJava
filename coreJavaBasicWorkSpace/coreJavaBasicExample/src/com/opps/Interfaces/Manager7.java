package com.opps.Interfaces;

interface Xx {
	void test1();
}

interface Yy {
	void test2();
}

interface Zz extends Xx, Yy {
	void test3();
}

interface Uu {
	void test4();
}

class Vv {
	void test5() {
		System.out.println("test5()");
	}
}

public class Manager7 extends Vv implements Zz, Uu {

	@Override
	public void test1() {
		System.out.println("test1()");
	}

	@Override
	public void test2() {
		System.out.println("test2()");
	}

	@Override
	public void test4() {
		System.out.println("test3()");
	}

	@Override
	public void test3() {
		System.out.println("test4()");
	}

	public static void main(String[] args) {
		Manager7 m = new Manager7();
		m.test1();
		m.test2();
		m.test3();
		m.test4();
		m.test5();
		System.out.println("done");
	}
}
