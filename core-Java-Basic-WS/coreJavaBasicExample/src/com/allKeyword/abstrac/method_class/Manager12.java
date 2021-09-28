package com.allKeyword.abstrac.method_class;

abstract class Manager13 {

	abstract void test1();

	abstract void test2();

	void test3() {
		System.out.println("test3()");
	}

}

abstract class Manager14 extends Manager13 {

	@Override
	void test1() {
		System.out.println("test3()");
	}
}

class Manager12 extends Manager14 {

	@Override
	void test2() {
		System.out.println("test2()");
	}

	public static void main(String[] args) {
		System.out.println();
		Manager12 obj = new Manager12();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
