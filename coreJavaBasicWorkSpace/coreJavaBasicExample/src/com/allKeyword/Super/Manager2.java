package com.allKeyword.Super;

//Using super keyword refers to the constructor from superclass 

public class Manager2 {

	public static void main(String[] argv) {
		new MySubclass();
	}
}

class MyClass1 {
	public MyClass1() {
	}

}

class MySubclass1 extends MyClass1 {
	public MySubclass1() {
		super();
	}

}