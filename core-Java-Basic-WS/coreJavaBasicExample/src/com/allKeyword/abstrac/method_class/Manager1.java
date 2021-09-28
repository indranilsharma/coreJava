
package com.allKeyword.abstrac.method_class;

abstract class A {

	//abs meh
	public abstract void test();

	//concreat method
	void test2() {
		System.out.println("test1()");
	}
}

public class Manager1 extends A {

	@Override
	public void test() {
		System.out.println("test() implemented");
	}

	public static void main(String[] arg) {
		Manager1 m = new Manager1();
		m.test();
		m.test2();
		System.out.println("main()");
	}
}
