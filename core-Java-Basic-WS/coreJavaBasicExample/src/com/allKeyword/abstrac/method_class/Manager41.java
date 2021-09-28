package com.allKeyword.abstrac.method_class;

abstract class Manager15 {

	abstract void test1();

	abstract void test2();

	abstract void test3();

	abstract void test4();
}

// AbstractExtends
abstract class Manager71 extends Manager15{

	@Override
	void test1() {
		System.out.println("test1()");
	}
}

class Manager41 extends Manager71 {

	@Override
	void test2() {
		System.out.println("test2()");
	}
	
	@Override
	void test3() {
		System.out.println("test3()");
	}

	@Override
	void test4() {
		System.out.println("test4()");
	}

	void test5() {
		System.out.println("test5()");
	}

	public static void main(String[] args) {
		System.out.println();
		Manager41 obj = new Manager41();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		System.out.println("done");
	}
}