package com.opps.Interfaces;

interface J {
	void test();

	void test(int i);

	double test(boolean b);
}

abstract class K implements J {
	@Override
	public void test() {
		System.out.println("test()");
	}

}

abstract class L extends K {
	@Override
	public void test(int i) {
		System.out.println(i);
		System.out.println("test(int i)");
	}
}

public class Manager6 extends L {

	@Override
	public double test(boolean b) {
		System.out.println("test(boolean b)");
		return 10.24d;
	}

	public static void main(String[] args) {
		Manager6 m = new Manager6();
		m.test();
		m.test(10);
		m.test(true);
		System.out.println(m.test(false));
	}
}
