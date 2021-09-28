package com.allKeyword.IIB;

public class Manager10 {

	static int i;

	//Static
	static {
		System.out.println(i);
		System.out.println("static");
	}
	//IIB
	{
		System.out.println(i);
		System.out.println("IIB");
	}

	static void test() {
		System.out.println(i);

		System.out.println("test()");
	}

	public static void main(String[] args) {
//		new Manager10();// pre object creation
		Manager10 m = new Manager10();
		System.out.println(m.getClass());
		System.out.println(m.hashCode());
		test();// static method no need object creation
		System.out.println(i);

	}
}
