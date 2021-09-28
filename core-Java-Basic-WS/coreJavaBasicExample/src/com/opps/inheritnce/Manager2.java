package com.opps.inheritnce;

class B {

	static int i = 100;
	int j = 200;

	void test1() {
		System.out.println("non static test1()");
	}

	static void test2() {
		System.out.println("static test1()");
	}
}

class C extends B {

	static int x = 100;
	int y = 200;

	void test3() {
		System.out.println("non static test3()");
	}

	static void test4() {
		System.out.println("static test4()");
	}
}

class Manager2 {

	public static void main(String[] args) {
		B.test2();
		// B.test1();//cant do bcz non static
		System.out.println(B.i);
		C.test4();
		// C.test1();//non static
		System.out.println(C.x);
		
		B b = new B();
		System.out.println(b.j);
		b.test1();
		C c = new C();
		c.test3();
		System.out.println(c.y);

	}
}
