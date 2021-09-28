package com.operators.instanceofOperator;

//You cannot use a java.lang.Class object reference.

class MyClass2 {

}

class MyAnotherClass2 extends MyClass2 {
}

public class Manager4 {
	public static void main(String[] argv) {
		MyClass2 myObject = new MyAnotherClass2();
		// MyAnotherClass2 myObject2 = new MyAnotherClass2();

		if (myObject instanceof MyAnotherClass2) {

			System.out.println("myobject is an instance of MyClass2");
		} else {
			System.out.println("somthing else");
		}

	}
}
