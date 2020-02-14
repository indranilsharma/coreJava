package com.allKeyword.Super;
 
//super is used to reference methods and field from superclass


public class Manager1 {
	public static void main(String[] argv) {
		new MySubclass();
	}
}

class MyClass {
	int i = 9;

	public MyClass() {
	}

}

class MySubclass extends MyClass {
	public MySubclass() {
		super();
		System.out.println(super.i);
	}

}