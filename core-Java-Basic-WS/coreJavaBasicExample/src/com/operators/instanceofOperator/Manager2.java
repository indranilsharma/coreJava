package com.operators.instanceofOperator;

class MyClass {

}

class MyAnotherClass {
}

// The instanceof operator tests the class of an object at runtime
public class Manager2 {

	public static void main(String[] argv) {
		MyClass myObject = new MyClass();

		if (myObject instanceof MyClass) {
			System.out.println("myobject is an instance of MyObject");
		}
		else {
			System.out.println("else");
		}

	}
}