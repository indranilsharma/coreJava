package com.allKeyword.abstrac.method_class;

abstract class Manager28 {
	public Manager28(int i) {
		System.out.println("Manager28(int)");
	}

	abstract void test1();
}

abstract class Manager29 extends Manager28 {
	
	Manager29() {
		super(90);
		System.out.println("Manager29()");
	}
}

public class Manager30 extends Manager29 {

	@Override
	void test1() {
		System.out.println("test1()");
	}

	public static void main(String[] args) {
		Manager30 obj = new Manager30();
		System.out.println("........");
		obj.test1();

	}
}
