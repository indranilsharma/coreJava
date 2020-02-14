package com.opps.Interfaces;

interface C {
	void test();// by default abstract and public
}

public class Manager1 implements C {

	@Override
	public void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		Manager1 m=new Manager1();
		m.test();
	}
}
