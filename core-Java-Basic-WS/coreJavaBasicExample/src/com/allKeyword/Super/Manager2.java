package com.allKeyword.Super;

//Using super keyword refers to the constructor from superclass 

class MyClass1 {
	public MyClass1() {
	System.out.println("base class");
	}
}

class MySubclass1 extends MyClass1 {
	public MySubclass1() {
		super();
		System.out.println("derived class");
	}
}

public class Manager2 {

	public static void main(String[] argv) {
		new MySubclass1();
	}
}
