package com.operators.instanceofOperator;

//The instanceof operator tests the class of an object at runtime
public class Manager2 {

	public static void main(String[] argv) {
		MyClass myObject = new MyClass();

		if (myObject instanceof MyClass) {
			System.out.println("myobject is an instance of MyObject");
		}

	}
}

class MyClass {

}
class MyAnotherClass {
}