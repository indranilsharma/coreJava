package com.allKeyword.abstrac.method_class;

abstract class Manager11 {

	final void test1() {
		System.out.println("final method");
	}

	 static void test2() {
		 System.out.println("staic method");
	}

	abstract void test3();
}

class Manager10 extends Manager11 {

	@Override
	void test3() {
		System.out.println("test3()");
	}

	public static void main(String[] args) {
		System.out.println();
		Manager10 obj = new Manager10();
		obj.test1();
		test2();
		obj.test3();
		System.out.println("done");
	}
}
