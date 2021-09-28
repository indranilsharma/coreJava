package com.allKeyword.Super;

//super is used to reference methods and field from superclass

class MyClass {
	int i = 9;
	public MyClass() {
		System.out.println("base class cons");
	}
}

class MySubclass extends MyClass {
	public MySubclass() {
		super();
		System.out.println(super.i);
		System.out.println("child cons");
	}
}

public class Manager1 {
	public static void main(String[] argv) {
		new MySubclass();
	}
}
