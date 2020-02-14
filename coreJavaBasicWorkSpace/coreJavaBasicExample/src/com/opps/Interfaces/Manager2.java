package com.opps.Interfaces;

interface D {
	void test();// by default abstract and public

	void test(int i);
}

public class Manager2 implements D {

	@Override
	public void test() {
		System.out.println("test()");
	}

	@Override
	public void test(int i) {
		System.out.println("test(int i)");
	}

	public static void main(String[] args) {
      Manager2 m=new Manager2();
      m.test();
      m.test(10);
	}
}
